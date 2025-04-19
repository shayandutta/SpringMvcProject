package com.shayan.mvc.springMvcProject.controllers;

import com.shayan.mvc.springMvcProject.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {


    //create student -> data required from client (student data)
    //this method is the handler that will handle the create student request from the client
    //we are receiving data in json format, springboot passes the data as the arguments of the handler
    //json --> Java object => deserialization  -> uses the Jackson library to achieve so


    @PostMapping("/create")
    public String createStudent(@RequestBody List<Student> students)  //maps store data in the form of key : "value" pair //the value can be string or object(generic data type)
    //data -> variable that stores the incoming json data   //@RequestBody -> de-serialises the data, converts the json object to Java ka `data`
    //Student is a custom class. student is a custom data type
    {
        System.out.println("Student list size: " + students.size());
        System.out.println(students);

        return "created";
    }
}
