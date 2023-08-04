package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Department {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer departmentId;
    private String departmentName;
    private String description;


    @OneToOne(mappedBy = "department")
    private EmployeeDetails manager;
}
