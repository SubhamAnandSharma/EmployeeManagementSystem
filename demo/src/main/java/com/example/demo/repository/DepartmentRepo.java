package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
