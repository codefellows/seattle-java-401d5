package com.ferreirae.dinosaur.models;

import javax.persistence.*;

@Entity
public class Dinosaur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String species;
    boolean eatsMeat;

    @ManyToOne
    ApplicationUser owner;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isEatsMeat() {
        return eatsMeat;
    }


    public Dinosaur(String name, String species, boolean eatsMeat, ApplicationUser owner) {

        this.name = name;
        this.species = species;
        this.eatsMeat = eatsMeat;
        this.owner = owner;
    }

    public Dinosaur () {}

    public String toString() {
        return String.format("%s, a %s that does%s eat meat", this.name, this.species, (this.eatsMeat ? "" : "n't"));
    }
}
