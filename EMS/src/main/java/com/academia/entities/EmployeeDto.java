package com.academia.entities;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

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
