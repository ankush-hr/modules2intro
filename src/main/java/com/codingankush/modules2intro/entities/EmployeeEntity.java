package com.codingankush.modules2intro.entities;

import jakarta.persistence.*;
//import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

//@Enabled
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
@Entity
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private  Long id ;
    private  String  name;
    private  String  email;
    private  Integer age ;
    private LocalDate dateOfJoining;
    private  Boolean isActive;
}
