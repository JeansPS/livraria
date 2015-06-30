package dev.jeans.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "Sptring Boot on Heroku";
    }

}
