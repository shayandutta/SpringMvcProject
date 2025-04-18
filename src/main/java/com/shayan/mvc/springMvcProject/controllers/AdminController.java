package com.shayan.mvc.springMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin") //using in the class level, to achieve the login html page -> URL -> (localhost:8080/admin/login)
public class AdminController {

    @RequestMapping("/login")
    public String showLoginPageHandler(){
        return "Login";
    }
}
