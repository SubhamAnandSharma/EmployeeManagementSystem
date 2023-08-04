package com.academia.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.entities.EmployeeDetails;
import com.academia.entities.EmployeeDto;

public interface EmployeeRepo extends JpaRepository<EmployeeDetails, Integer>{

	EmployeeDetails saveAll(EmployeeDto employee);

}
