package com.kgn.employee_service.controller;

import com.kgn.employee_service.entity.EmployeeEntity;
import com.kgn.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
@Autowired
    EmployeeService employeeService;
    @GetMapping("/{id}")
   public Optional<EmployeeEntity> getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }
}
