package com.shayan.mvc.springMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController    //no need of writing @ResponseBody for every api, rather write @RestController -> combination of @Controller and @ResponseBody
//@Controller
@RequestMapping("api")
public class ApiController {


    @RequestMapping("/hello")
//    @ResponseBody  //we need response as text (bounding the content to the response body)
    public String helloApi(){
        return "Hello, how are you";
    }

    @RequestMapping("/users")
//    @ResponseBody
    public List<String> getUserData(){
        return Arrays.asList("ram", "shayan");
    }
}
