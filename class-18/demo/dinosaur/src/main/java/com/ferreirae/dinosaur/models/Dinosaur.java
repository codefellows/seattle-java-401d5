package com.ferreirae.dinosaur.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(
            // name is potato
            name="dinosaur_likes",
            // join columns: column where I find my own ID
            joinColumns = { @JoinColumn(name="primaryDino") },
            // inverse: column where I find someone else's ID
            inverseJoinColumns = { @JoinColumn(name="likedDino") }
    )
    Set<Dinosaur> dinosaursThatILike;

    @ManyToMany(mappedBy = "dinosaursThatILike")
    Set<Dinosaur> dinosaursThatLikeMe;

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

    public void addLike(Dinosaur likedDino) {
        dinosaursThatILike.add(likedDino);
    }

    public Set<Dinosaur> getLikedDinos() {
        return this.dinosaursThatILike;
    }


    public Dinosaur(String name, String species, boolean eatsMeat, ApplicationUser owner) {

        this.name = name;
        this.species = species;
        this.eatsMeat = eatsMeat;
        this.owner = owner;
    }

    public Dinosaur () {}

    public String toString() {
        StringBuilder likedDinosString = new StringBuilder();
        if (this.dinosaursThatILike.size() > 0) {
            likedDinosString.append(" who likes ");
            for (Dinosaur likedDino : this.dinosaursThatILike) {
                likedDinosString.append(likedDino.name);
                likedDinosString.append(", ");
            }
            likedDinosString.delete(likedDinosString.length() - 2, likedDinosString.length());
        }

        return String.format("%s, the %s that does%s eat meat%s", this.name, this.species, (this.eatsMeat ? "" : "n't"), likedDinosString.toString());
    }
}
