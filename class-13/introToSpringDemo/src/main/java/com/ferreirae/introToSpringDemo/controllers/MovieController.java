package com.ferreirae.introToSpringDemo.controllers;

import com.ferreirae.introToSpringDemo.models.Director;
import com.ferreirae.introToSpringDemo.models.DirectorRepository;
import com.ferreirae.introToSpringDemo.models.Movie;
import com.ferreirae.introToSpringDemo.models.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.Date;
import java.util.List;

@Controller
public class MovieController {

    @Autowired
    MovieRepository movieRepository;
    @Autowired
    DirectorRepository directorRepository;

    @GetMapping("/movies")
    public String getAllMovies(Model m) {
//        Movie theMovie = new Movie("Forrest Gump", "Robert Zemeckis", Date.valueOf("1994-07-06"), 72.0, "PG-13");
//        Movie secondMovie = new Movie("Shawshank Redemption", "Frank Darabont", Date.valueOf("1994-09-23"), 91.0, "R");
//        Movie[] movies = new Movie[]{theMovie, secondMovie};
        List<Movie> movies = movieRepository.findAll();
        m.addAttribute("movies", movies);
        return "allMovies";
    }

    @PostMapping("/movies")
    public RedirectView addMovie(String title, String director, String releaseDate) {
        Director d =new Director(director);
        directorRepository.save(d);
        Movie m = new Movie(title, d, Date.valueOf(releaseDate), 0.0, "R");
        movieRepository.save(m);
        return new RedirectView("/movies");
    }
}
