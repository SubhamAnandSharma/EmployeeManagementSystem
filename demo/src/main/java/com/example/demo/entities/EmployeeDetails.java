package com.example.demo.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class EmployeeDetails {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer employeeId;
    private String employeeName;
    private String employeeAddress;
//    @JsonFormat(pattern = "dd/MM/yyyy")
//    private Date birthDate;


    @ManyToOne
    private Department department;

    private LocalDate joinDate = LocalDate.now();
    private String gender;
    private Integer contactNumber;
    private String email;
    private Integer salary;


}
