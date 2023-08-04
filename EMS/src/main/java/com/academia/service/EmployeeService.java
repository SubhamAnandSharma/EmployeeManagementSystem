package com.academia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.academia.entities.EmployeeDetails;
import com.academia.entities.EmployeeDto;


public interface EmployeeService {

	public EmployeeDetails addNewEmployeeDetails(EmployeeDto emp);
	EmployeeDetails getEmployeeDetails(Integer id);
    List<EmployeeDetails> getAllEmployees();
    void updateEmployee(Integer id, EmployeeDto updatedEmployee);
    void deleteEmployee(Integer id);
	EmployeeDetails getEmployeeById(Integer id);
	
}
