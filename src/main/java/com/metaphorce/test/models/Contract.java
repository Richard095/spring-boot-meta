package com.metaphorce.test.models;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table ( name = "contracts")
public class Contract  {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Getter @Setter @Column(unique = true, nullable = false, name = "ContractId")
    private Integer ContractId;

    @Getter @Setter @Column(nullable = false, name = "DateFrom")
    private Date DateFrom;

    @Getter @Setter @Column(nullable = false, name = "DateTo")
    private Date DateTo;

    @Getter @Setter @Column(nullable = false, name = "SalaryPerDay")
    private Double SalaryPerDay;


    @Getter @Setter @Column(nullable = false,  columnDefinition="tinyint(1) default 1" , name = "IsActive")
    protected  boolean IsActive;

    @Getter @Setter @Column( nullable = false, name = "DateCreated")
    protected Date DateCreated;
    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ContractTypeId", nullable = false)
    private ContractType ContractType;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EmployeeId", nullable = true)
    private Employee Employee;

    // default constructor
    public Contract(){ }

    public Contract(Integer contractId, Date dateFrom, Date dateTo, Double salaryPerDay, boolean isActive, Date dateCreated, ContractType contractType, Employee employee) {
        this.ContractId = contractId;
        this.DateFrom = dateFrom;
        this.DateTo = dateTo;
        this.SalaryPerDay = salaryPerDay;
        this.IsActive = isActive;
        this.DateCreated = dateCreated;
        this.ContractType = contractType;
        this.Employee = employee;
    }

}
