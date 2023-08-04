package com.example.demo.service;
import java.util.List;

import com.example.demo.entities.Department;

public interface DeparmentService {

    Department createDepartment(Department department);
    Department getDepartmentById(Integer id);
    List<Department> getAllDepartments();
    String updateDepartment(Integer id, Department updatedDepartment);
    String deleteDepartment(Integer id);


}
