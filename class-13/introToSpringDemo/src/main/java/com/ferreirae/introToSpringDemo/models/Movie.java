package com.ferreirae.introToSpringDemo.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;

    @ManyToOne
    Director director;

    Date releaseDate;
    double rottenTomatoesScore;
    String mpaaRating;

    public Movie() {}
    public Movie (String title, Director director, Date releaseDate, double rottenTomatoesScore, String mpaaRating){
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rottenTomatoesScore = rottenTomatoesScore;
        this.mpaaRating = mpaaRating;
    }

    public Director getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }
}
