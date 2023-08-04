package com.academia.service;

import java.util.List;

import com.academia.entities.Department;

public interface DeparmentService {

	Department createDepartment(Department department);
    Department getDepartmentById(Integer id);
    List<Department> getAllDepartments();
    void updateDepartment(Integer id, Department updatedDepartment);
    void deleteDepartment(Integer id);
}
