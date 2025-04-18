package com.shayan.mvc.springMvcProject.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeedBackController {

//    short cut annotation for @RequestMapping(value="/", method=  )
//    @RequestMapping(value = "/feedbacks", method = RequestMethod.GET)   ->    can be replaced by @GetMapping directly, POST -> PostMapping
    @GetMapping("/feedbacks")
    public List<String> getFeedbacks(){
        List<String> feedBacks = Arrays.asList(
                "Good instructor",
                "Nice One",
                "valuable thing"
        );

        return feedBacks;
    }



    @PostMapping("/createFeedback")
    public String createFeedback(){
        System.out.println("Feedback created");
        return "Created Feedback";
    }

    /*
    //different Mapping annotations available to send http responds
    @PutMapping
    @DeleteMapping
    @PatchMapping
     */



}
