package com.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.entities.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
