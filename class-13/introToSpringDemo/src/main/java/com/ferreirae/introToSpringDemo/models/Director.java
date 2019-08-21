package com.ferreirae.introToSpringDemo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String firstName;
    String lastName;

    @OneToMany
    List<Movie> movies;

    public Director(String name) {
        String[] names = name.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public Director() {}

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public String toString() {
        return String.format("%s %s HELLO", this.firstName, this.lastName);
    }
}
