//pass query param or if needed clean url, use path variable

package com.shayan.mvc.springMvcProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/getProduct")   // URL -> /getProduct?productName=iphone13StarlightWhite&productId=1321
    //productName wala query parameter will be passed to String productName,
    //dono ka naam sahi raha toh ek baar likhne se hi hota hai
    public String getProduct(
            @RequestParam("") String productName, //dono ka naam sahi raha toh ek baar likhne se hi hota hai
            @RequestParam(value = "productRating", defaultValue = "0", required = false) int rating,  //agar query param mein yeh value pass nahi kia, then the default value will be applied only if required = false(default is true)
            @RequestParam("productId") int id){   //dono ka naam different hai to need to mention both the names

        System.out.println("productName : " + productName);
        System.out.println("productRating : " + rating);
        System.out.println("productId : " + id);

        return "This is testing product URL";
    }

    @GetMapping("/checkProduct/{productId}/{productName}/{productRating}")    //productId -> dynamic value, uses path variable
    public String checkProduct(
            @PathVariable("productId") int productId,
            @PathVariable("productName") String productName,
            @PathVariable("productRating") int productRating
    ){


        System.out.println("product id: " + productId);
        System.out.println("productName : " + productName);
        System.out.println("productRating : " + productRating);
        return "this is checking the concept of @pathvariable";
    }
}
