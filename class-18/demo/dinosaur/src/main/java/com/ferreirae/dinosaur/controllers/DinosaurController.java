package com.ferreirae.dinosaur.controllers;

import com.ferreirae.dinosaur.models.ApplicationUser;
import com.ferreirae.dinosaur.models.ApplicationUserRepository;
import com.ferreirae.dinosaur.models.Dinosaur;
import com.ferreirae.dinosaur.models.DinosaurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping("/dinosaurs/likes")
    public String getDinosaurLikesForm(Model m) {
        m.addAttribute("dinosaurs", dinosaurRepository.findAll());
        return "addDinoLikes";
    }

    @PostMapping("/dinosaurs/likes")
    public RedirectView addDinoLike(long likedDino, long likingDino) {
        Dinosaur likingDinosaur = dinosaurRepository.findById(likingDino).get();
        likingDinosaur.addLike(dinosaurRepository.findById(likedDino).get());
        dinosaurRepository.save(likingDinosaur);
        return new RedirectView("/");
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
