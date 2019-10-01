package com.codefellows.People.Controllers;

import com.codefellows.People.Models.Person;
import com.codefellows.People.Repository.PersonRepository;

import com.codefellows.People.Repository.S3Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    private S3Client s3Client;

    @Autowired
    PersonController(S3Client s3Client) {
        this.s3Client = s3Client;
    }

    @GetMapping("/people")
    public List<Person> getCustomers() {
         return (List) personRepository.findAll();
    }

    // NEW
    @PostMapping("/upload")
    public Person uploadFile(
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            @RequestPart(value = "file") MultipartFile file
    ){

        String pic = this.s3Client.uploadFile(file);
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setPic(pic);
        person.addToHistory("create", "a thing");
        personRepository.save(person);
        return person;

    }

    @PostMapping("/people")
    public Person addNewUser (@RequestBody Person body) {
        Person person = new Person();
        person.setName( body.getName() );
        person.setAge( body.getAge() );
        person.addToHistory("create", "a thing");
        personRepository.save(person);
        return person;
    }

}
