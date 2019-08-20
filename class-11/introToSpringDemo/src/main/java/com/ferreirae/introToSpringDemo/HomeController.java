package com.ferreirae.introToSpringDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    // in node.js, our controllers had lines like app.get("/", (req, res) => ...)
    @GetMapping("/")
    public String getRoot() {
        System.out.println("somebody got the root");
        // needs to match exactly the filename of a template in resources/templates
        return "helloworld";
    }

    // Models: useful for passing data to templates
    @GetMapping("/sayHello")
    public String getSayHello(@RequestParam(required=false, defaultValue = "friendo") String name, Model m) {
        // add any pieces of data that you want available in the template
        m.addAttribute("firstName", name);
        return "sayHello";
    }

    // Example of using path variable
//    @GetMapping("/sayHello/{name}")
//    public String getSayHello(@PathVariable String name, Model m) {
//        // add any pieces of data that you want available in the template
//        m.addAttribute("firstName", name);
//        return "sayHello";
//    }
}
