package com.metaphorce.test.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class EmployeeDto {
    @Getter @Setter
    private String Name;
    @Getter @Setter
    private String LastName;
    @Getter @Setter
    private String TaxIdNumber;
    @Getter @Setter
    private String Email;
    @Getter @Setter
    private String ContractTypeName;
    @Getter @Setter
    private Date ContractDateFrom;
    @Getter @Setter
    private Date ContractDateTo;
    @Getter @Setter
    private Double SalaryPerDay;

    public EmployeeDto(String name, String lastName, String taxIdNumber, String email, String ContractTypeName, Date ContractDateFrom, Date ContractDateTo, Double salaryPerDay) {
        this.Name = name;
        this.LastName = lastName;
        this.TaxIdNumber = taxIdNumber;
        this.Email = email;
        this.ContractTypeName = ContractTypeName;
        this.ContractDateFrom = ContractDateFrom;
        this.ContractDateTo = ContractDateTo;
        this.SalaryPerDay = salaryPerDay;
    }

}
