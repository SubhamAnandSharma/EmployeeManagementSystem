package com.example.demo.service;


import java.util.List;

import com.example.demo.entities.EmployeeDetails;

import com.example.demo.entities.EmployeeDto;


public interface EmployeeService {

    public String addNewEmployeeDetails(EmployeeDetails emp);
    EmployeeDetails getEmployeeDetails(Integer id);
    List<EmployeeDetails> getAllEmployees();
    String updateEmployee(Integer id, EmployeeDto updatedEmployee);
    String deleteEmployee(Integer id);
    EmployeeDetails getEmployeeById(Integer id);

}
