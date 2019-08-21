package com.ferreirae.introToSpringDemo.controllers;

import com.ferreirae.introToSpringDemo.models.Director;
import com.ferreirae.introToSpringDemo.models.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DirectorController {
    @Autowired
    DirectorRepository directorRepository;

    @GetMapping("/directors/{id}")
    public String getOneDirector(@PathVariable long id, Model m) {
        Director d = directorRepository.findById(id).get();
        System.out.println(d.getMovies().size());
        m.addAttribute("director", d);
        return "oneDirector";
    }
}
