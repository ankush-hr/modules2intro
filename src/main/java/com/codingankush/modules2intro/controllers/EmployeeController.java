package com.codingankush.modules2intro.controllers;

import com.codingankush.modules2intro.dto.EmployeeDto;
import com.codingankush.modules2intro.entities.EmployeeEntity;
import com.codingankush.modules2intro.repositories.EmployeeRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
//    @GetMapping("/hi")
//    public String home(String hii) {
//        return "Hello Ankush, Spring Boot is running!";
//    }

    public  final EmployeeRepositories employeeRepositories;

    public EmployeeController(EmployeeRepositories employeeRepositories) {
        this.employeeRepositories = employeeRepositories;
    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeId") long Id){
        return  employeeRepositories.findById(Id).orElse(null);

//        return new EmployeeDto(Id , "Ankush","ankush@gmail.com",21 ,
//                LocalDate.of(2025 ,11 ,28), true);

    }
    @GetMapping
    public List<EmployeeEntity> getname (@RequestParam(required = false, name = "inputAge") Integer age,
                                         @RequestParam(required = false ) String sortBy) {
        return  employeeRepositories.findAll();
        //return "hi my age is "+ age + sortBy;

    }

    @PostMapping
    public EmployeeEntity  createNewNewEmployee(@RequestBody EmployeeEntity inputEmployee ){
        return  employeeRepositories.save(inputEmployee);
//        inputEmployee.setId(100L);
//        return inputEmployee;
    }

    @PutMapping
    public String updateEmployeeByid(){
        return "I am from put";
    }
}
