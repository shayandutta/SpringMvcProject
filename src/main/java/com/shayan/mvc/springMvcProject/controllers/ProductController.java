package com.shayan.mvc.springMvcProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/getProduct")
    //productName wala query parameter will be passed to String productName,
    //dono ka naam sahi raha toh ek baar likhne se hi hota hai
    public String getProduct(
            @RequestParam("productName") String productName,
            @RequestParam(value = "productRating", defaultValue = "0", required = false) int rating,  //agar query param mein yeh value pass nahi kia, then the default value will be applied only if required = false(default is true)
            @RequestParam("productId") int id){

        System.out.println("productName : " + productName);
        System.out.println("productRating : " + rating);
        System.out.println("productId : " + id);

        return "This is testing product URL";
    }
}
