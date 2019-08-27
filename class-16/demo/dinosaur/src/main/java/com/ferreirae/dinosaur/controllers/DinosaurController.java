package com.ferreirae.dinosaur.controllers;

import com.ferreirae.dinosaur.models.ApplicationUser;
import com.ferreirae.dinosaur.models.ApplicationUserRepository;
import com.ferreirae.dinosaur.models.Dinosaur;
import com.ferreirae.dinosaur.models.DinosaurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;

@Controller
public class DinosaurController {

    @Autowired
    ApplicationUserRepository applicationUserRepository;
    @Autowired
    DinosaurRepository dinosaurRepository;


    @GetMapping("/dinosaurs/adopt")
    public String getDinosaurAdoptionForm() {
        return "adopt";
    }

    // assume that this new dinosaur belongs to the logged-in user
    @PostMapping("/dinosaurs/adopt")
    public RedirectView createDinosaur(String name, String species, boolean eatsMeat, Principal p) {
        ApplicationUser loggedInUser = applicationUserRepository.findByUsername(p.getName());
        Dinosaur dinosaur = new Dinosaur(name, species, eatsMeat, loggedInUser);
        dinosaurRepository.save(dinosaur);
        return new RedirectView("/users/" + loggedInUser.getId());
    }
}
