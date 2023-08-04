package com.example.demo.controller;

import com.example.demo.entities.EmployeeDetails;
import com.example.demo.entities.EmployeeDto;
import com.example.demo.serviceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/message")
    public ResponseEntity<?> getmessage(){
        return ResponseEntity.ok("This is working though!");
    }
    @PostMapping("/emp/create")
    public ResponseEntity<String> createEmployeeHandler(@RequestBody EmployeeDetails emp){
        String message = employeeService.addNewEmployeeDetails(emp);
        return new ResponseEntity<String>(message, HttpStatus.CREATED);
    }

    @GetMapping("/emp/{id}")
    public ResponseEntity<EmployeeDetails> getEmployeeById(@PathVariable Integer id) {
        EmployeeDetails employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/emp/all")
    public ResponseEntity<List<EmployeeDetails>> getAllEmployees() {
        List<EmployeeDetails> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @PutMapping("/emp/{id}")
    public ResponseEntity<Void> updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDto updatedEmployee) {
        employeeService.updateEmployee(id, updatedEmployee);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
        String message = employeeService.deleteEmployee(id);
        return ResponseEntity.ok(message);
    }

}