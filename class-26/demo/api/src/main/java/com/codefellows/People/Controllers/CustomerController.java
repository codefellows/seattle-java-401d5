package com.codefellows.People.Controllers;

import com.codefellows.People.Models.Customer;
import com.codefellows.People.Repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return (List) customerRepository.findAll();
    }

    // NEW
//    @PostMapping("/customers")
//    public Customer createCustomer(
//            @RequestParam("name") String name,
//            @RequestParam("old") Boolean old
//    ){
//
//        Customer customer = new Customer();
//        customer.setName(name);
//        customer.setOld( Boolean.valueOf(old) );
//        customerRepository.save(customer);
//        return customer;
//    }

    @PostMapping("/customers")
    public Customer addNewUser (@RequestBody Customer customer) {
        Customer c = new Customer();
        c.setName( customer.getName() );
        c.setOld( customer.getOld() );
        customerRepository.save(c);
        return c;
    }
}
