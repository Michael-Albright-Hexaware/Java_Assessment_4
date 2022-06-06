package com.example.Java_Assessment_4.controller;


import com.example.Java_Assessment_4.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    Employee employee;

    @PostMapping("/employee")
    public Map<String, String> addEmployee(@Valid @RequestBody Employee emp) {
        Map<String, String> response = new HashMap<>();
        try {
            employee.setName(emp.getName());
            employee.setEmail(emp.getEmail());
            employee.setSalary(emp.getSalary());
            response.put("Status", "VALID");
            response.put("errors", "[]");
            return response;
        } catch(Exception e) {
            response.put("Status", "ERROR");
            response.put("errors", "[" + employee.getName() + ", " + employee.getEmail() + ", " + employee.getSalary() + "]");
            return response;
        }
    }
}
