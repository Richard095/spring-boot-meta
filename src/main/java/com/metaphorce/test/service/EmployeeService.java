package com.metaphorce.test.service;

import com.metaphorce.test.dto.EmployeeDto;
import com.metaphorce.test.models.Employee;

import java.util.ArrayList;

public interface EmployeeService {
    ArrayList<EmployeeDto> whereEmployeeIsActive();
}
