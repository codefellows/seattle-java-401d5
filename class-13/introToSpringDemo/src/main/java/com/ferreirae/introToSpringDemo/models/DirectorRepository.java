package com.ferreirae.introToSpringDemo.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director, Long> {
    public Director findByFirstNameAndLastName(String firstName, String lastName);
}
