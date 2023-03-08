package com.sbHiberantes.sbHiberantes.controller;

import com.sbHiberantes.sbHiberantes.entity.Employee;
import com.sbHiberantes.sbHiberantes.repos.EmployeeCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getEmployee")
public class EmployeeController {
    @Autowired
    EmployeeCrudRepo employeeCrudRepo;

    @GetMapping
    public List<Employee> getAllEmployees(){
        System.out.println("All Employee Returned");
        return employeeCrudRepo.findAll();
    }


}
