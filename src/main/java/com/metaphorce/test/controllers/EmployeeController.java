package com.metaphorce.test.controllers;

import com.metaphorce.test.dto.EmployeeDto;
import com.metaphorce.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public ArrayList<EmployeeDto> whereEmployeeIsActive(){
        return this.employeeService.whereEmployeeIsActive();
    }

}
