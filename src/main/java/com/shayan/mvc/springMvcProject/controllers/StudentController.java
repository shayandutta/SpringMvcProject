package com.shayan.mvc.springMvcProject.controllers;

import com.shayan.mvc.springMvcProject.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody List<Student> students)
    {
        System.out.println("Student list size: " + students.size());
        System.out.println(students);


//        Map<String, Object> data = new HashMap<>();
//        data.put("content", students);
//        data.put("error", "No error found");
//        data.put("currentDate", new Date());
//        data.put("systemInformation", System.getProperties());


        //ERROR generate -> 500 internal server error
//        String str = null;
//        System.out.println(str.length());

//        return data;

        //STATUS CODE GENERATION
//        ResponseEntity<Student> response = new ResponseEntity<>(students.get(0), HttpStatus.CREATED);

        //builder method
        ResponseEntity<Student> response = ResponseEntity.status(HttpStatus.CREATED).body(students.get(0));


        return response;
    }




}
