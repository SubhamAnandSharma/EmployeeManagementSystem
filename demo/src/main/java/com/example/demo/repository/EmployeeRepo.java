package com.example.demo.repository;

import com.example.demo.entities.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeDetails, Integer>{


}
