package com.codingankush.modules2intro.entities;

import jakarta.persistence.Table;
import jdk.jfr.Enabled;

import java.time.LocalDate;

@Enabled
@Table(name = "employee")
public class EmployeeEntity {

    private  Long id ;
    private  String  name;
    private  String  email;
    private  Integer age ;
    private LocalDate dateOfJoining;
    private  Boolean isActive;
}
