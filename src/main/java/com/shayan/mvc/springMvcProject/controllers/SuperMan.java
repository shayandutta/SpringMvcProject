//superman class is accepting requests, we call them controllers -> "@Controller" annotation
package com.shayan.mvc.springMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//component annotation means, it's a component of the Spring IOC container, so iska bean bana do
//controller annotation -> java class that handles requests (also makes it a bean)
@Controller
public class SuperMan {
    /*

    /about
    @RequestMapping is used for mapping the URL with controller method


     */
    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Processing about request");
        return "about";
    }


    @RequestMapping("/services")
    public String serviceRequestHandler(){
        System.out.println("Processing service request");
        return "services";
    }
}
