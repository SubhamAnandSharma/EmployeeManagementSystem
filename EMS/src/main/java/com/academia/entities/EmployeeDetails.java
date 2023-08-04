package com.academia.entities;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class EmployeeDetails {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String employeeName;
	private String employeeAddress;
	private Date birthDate;
	
	
	private Department department;
	
	private LocalDateTime joinDate;
	private String gender;
	private String contact;
	private String email;
	private Integer salary;
	
	
}
