package com.metaphorce.test.repository;

import com.metaphorce.test.dto.EmployeeDto;
import com.metaphorce.test.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /*
    SELECT e.`Name` AS EName, e.LastName,
    e.TaxIdNumber,e.Email, ct.`Name`  AS CTName, c.DateFrom, c.DateTo, c.SalaryPerDay
    FROM employees e
    LEFT JOIN contracts c ON c.ContractId = e.EmployeeId
    LEFT JOIN contract_types ct ON ct.ContractTypeId = c.ContractId
    WHERE e.IsActive = true;
    * */

    @Query("SELECT new  com.metaphorce.test.dto.EmployeeDto(e.Name, e.LastName,e.TaxIdNumber, " +
            "e.Email, ct.Name, c.DateFrom, c.DateTo, c.SalaryPerDay) " +
            "FROM Employee e " +
            "LEFT JOIN Contract c ON c.ContractId = e.EmployeeId  " +
            "LEFT JOIN ContractType ct ON ct.ContractTypeId = c.ContractId " +
            "WHERE e.IsActive = true")
    ArrayList<EmployeeDto> whereEmployeeIsActive();

}
