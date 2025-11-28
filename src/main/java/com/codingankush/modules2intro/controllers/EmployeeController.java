package com.codingankush.modules2intro.controllers;

import com.codingankush.modules2intro.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {
//    @GetMapping("/hi")
//    public String home(String hii) {
//        return "Hello Ankush, Spring Boot is running!";
//    }

    @GetMapping("/employees/{employeeId}")
    public EmployeeDto getEmployeeById( @PathVariable long employeeId){
        return new EmployeeDto(employeeId , "Ankush","ankush@gmail.com",21 ,
                LocalDate.of(2025 ,11 ,28), true );


    }
}
