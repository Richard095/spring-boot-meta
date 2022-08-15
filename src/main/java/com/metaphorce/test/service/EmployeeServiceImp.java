package com.metaphorce.test.service;

import com.metaphorce.test.dto.EmployeeDto;
import com.metaphorce.test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override

    public ArrayList<EmployeeDto> whereEmployeeIsActive() {
        return this.employeeRepository.whereEmployeeIsActive();
    }
}
