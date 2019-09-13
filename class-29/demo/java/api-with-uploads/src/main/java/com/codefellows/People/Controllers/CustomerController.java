package com.codefellows.People.Controllers;

import com.codefellows.People.Models.Customer;
import com.codefellows.People.Repository.CustomerRepository;

import com.codefellows.People.Repository.S3Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    private S3Client s3Client;

    @Autowired
    CustomerController(S3Client s3Client) {
        this.s3Client = s3Client;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
//        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
//        DynamoDBMapper mapper = new DynamoDBMapper( client );
//        return mapper.scan(Customer.class, new DynamoDBScanExpression());
         return (List) customerRepository.findAll();
    }

    // NEW
    @PostMapping("/person")
    public Customer uploadFile(
            @RequestParam("name") String name,
            @RequestParam("old") String old,
            @RequestPart(value = "file") MultipartFile file
    ){

        String pic = this.s3Client.uploadFile(file);
        Customer customer = new Customer();
        customer.setName(name);
        customer.setOld( Boolean.valueOf(old) );
        customer.setPic(pic);
        customerRepository.save(customer);
        return customer;

    }

    @PostMapping("/customers")
    public Customer addNewUser (@RequestBody Customer body) {
        Customer customer = new Customer();
        customer.setName( body.getName() );
        customer.setOld( body.getOld() );
//        customer.setHistory("create", "a thing");
        customerRepository.save(customer);
        return customer;
    }

}
