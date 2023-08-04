package com.example.demo.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.EmployeeDetails;
import com.example.demo.entities.EmployeeDto;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepository;

    @Override
    public String addNewEmployeeDetails(EmployeeDetails employee) {
        employeeRepository.save(employee);
        return "Employee Created Successfully!";
    }

    @Override
    public EmployeeDetails getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<EmployeeDetails> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public String updateEmployee(Integer id, EmployeeDto updatedEmployee) {
        EmployeeDetails existingEmployee = employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            employeeRepository.save(existingEmployee);
        }
        return "Employee Updated Successfully!";
    }



    @Override
    public EmployeeDetails getEmployeeDetails(Integer id) {
        EmployeeDetails existingEmployee = employeeRepository.findById(id).orElse(null);
        return existingEmployee;
    }


    @Override
    public String deleteEmployee(Integer id) {
        // TODO Auto-generated method stub
        EmployeeDetails existingEmployee = employeeRepository.findById(id).orElse(null);
        employeeRepository.delete(existingEmployee);
        return "Employee Deleted Successfully!";
    }
}
