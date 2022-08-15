package com.metaphorce.test.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Setter @Getter @Column(unique = true, nullable = false, name = "EmployeeId")
    private  Integer EmployeeId ;

    @Setter @Getter @Column( unique = true, nullable = false, name = "TaxIdNumber", length = 13)
    private  String TaxIdNumber;

    @Setter @Getter @Column( nullable = false, name = "Name", length = 60)
    private String Name;

    @Setter @Getter @Column( nullable = false, name = "LastName",length = 120)
    private String LastName;

    @Setter @Getter @Column( nullable = false, name = "BirthDate")
    private Date BirthDate;

    @Setter @Getter @Column( nullable = false, name = "Email", length = 60)
    private String Email;

    @Setter @Getter @Column( nullable = false, name = "CellPhone")
    private String CellPhone;

    @Getter @Setter
    @Column( columnDefinition="tinyint(1) default 1" , name = "IsActive")
    protected  boolean IsActive;

    @Column( nullable = true, name = "DateCreated")
    @Getter @Setter
    protected Date DateCreated;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @Getter @Setter
    private List<Contract> contracts ;

    public Employee(Integer employeeId, String taxIdNumber, String name, String lastName, Date birthDate, String email, String cellPhone, boolean isActive, Date dateCreated, List<Contract> contracts) {
        EmployeeId = employeeId;
        TaxIdNumber = taxIdNumber;
        Name = name;
        LastName = lastName;
        BirthDate = birthDate;
        Email = email;
        CellPhone = cellPhone;
        IsActive = isActive;
        DateCreated = dateCreated;
        this.contracts = contracts;
    }
}
