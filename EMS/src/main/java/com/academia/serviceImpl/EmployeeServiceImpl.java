package com.academia.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.entities.EmployeeDetails;
import com.academia.entities.EmployeeDto;
import com.academia.repository.EmployeeRepo;
import com.academia.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepository;

//    @Override
//    public EmployeeDetails addNewEmployeeDetails(EmployeeDto employee) {
//        // Add any business logic or validations before saving the employee
//        return employeeRepository.saveAll(employee);
//    }

    @Override
    public EmployeeDetails getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<EmployeeDetails> getAllEmployees() {
        return employeeRepository.findAll();
    }

//    @Override
//    public void updateEmployee(Integer id, EmployeeDetails updatedEmployee) {
//        EmployeeDetails existingEmployee = employeeRepository.findById(id).orElse(null);
//        if (existingEmployee != null) {
//            // Update the existingEmployee object with updatedEmployee attributes
//            // Add any business logic or validations if needed
//            employeeRepository.save(existingEmployee);
//        }
//    }

    

	

	@Override
	public EmployeeDetails getEmployeeDetails(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Integer id, EmployeeDto updatedEmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
	}
}

