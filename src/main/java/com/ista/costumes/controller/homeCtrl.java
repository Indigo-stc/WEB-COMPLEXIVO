package com.ista.costumes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeCtrl {

    @GetMapping("/api")
    public String home() {
        return "home";
    }

}
