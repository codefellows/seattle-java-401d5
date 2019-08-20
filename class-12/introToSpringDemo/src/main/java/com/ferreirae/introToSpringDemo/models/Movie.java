package com.ferreirae.introToSpringDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String director;
    Date releaseDate;
    double rottenTomatoesScore;
    String mpaaRating;

    public Movie() {}
    public Movie (String title, String director, Date releaseDate, double rottenTomatoesScore, String mpaaRating){
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rottenTomatoesScore = rottenTomatoesScore;
        this.mpaaRating = mpaaRating;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }
}
