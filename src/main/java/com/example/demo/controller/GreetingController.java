package com.example.demo.controller;

//https://spring.io/guides/gs/serving-web-content/#scratch
//https://www.thymeleaf.org/doc/tutorials/2.1/thymeleafspring.html

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}