package com.shayan.mvc.springMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController    //no need of writing @ResponseBody for every api, rather write @RestController -> combination of @Controller and @ResponseBody
//@Controller
@RequestMapping("api")
public class ApiController {


    @RequestMapping(value="/hello", method = RequestMethod.GET)
//    @ResponseBody  //we need response as text (bounding the content to the response body)
    public String helloApi(){
        return "Hello, how are you";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    @ResponseBody
    public List<String> getUserData(){
        return Arrays.asList("ram", "shayan");
    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public String createUser(){
        System.out.println("creating User");
        return "User created successfully";
    }












}
