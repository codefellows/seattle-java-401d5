package com.codefellows.People.Repository;

import com.codefellows.People.Models.Person;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface PersonRepository extends CrudRepository<Person, String> {
    Optional<Person> findById(String id);
}
