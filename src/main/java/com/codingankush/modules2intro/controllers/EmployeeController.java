package com.codingankush.modules2intro.controllers;

import com.codingankush.modules2intro.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
//    @GetMapping("/hi")
//    public String home(String hii) {
//        return "Hello Ankush, Spring Boot is running!";
//    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDto getEmployeeById( @PathVariable(name = "employeeId") long Id){
        return new EmployeeDto(Id , "Ankush","ankush@gmail.com",21 ,
                LocalDate.of(2025 ,11 ,28), true );

    }
    @GetMapping
    public  String getname (@RequestParam(required = false, name = "inputAge") Integer age,
                            @RequestParam(required = false ) String sortBy) {
        return "hi my age is "+ age + sortBy;

    }

    @PostMapping
    public EmployeeDto  createNewNewEmployee(@RequestBody EmployeeDto inputEmployee ){
        inputEmployee.setId(100L);
        return inputEmployee;
    }

    @PutMapping
    public String updateEmployeeByid(){
        return "I am from put";
    }
}
