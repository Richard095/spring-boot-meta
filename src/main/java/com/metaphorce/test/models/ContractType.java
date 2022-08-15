package com.metaphorce.test.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table ( name = "contract_types" )
public class ContractType  {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Getter @Setter @Column(unique = true,nullable = false, name = "ContractTypeId")
    private  Long ContractTypeId;

    @Getter @Setter @Column(nullable = false, name = "Name")
    private String Name;

    @Getter @Setter @Column( name = "Description")
    private String Description;

    @OneToMany(mappedBy = "ContractType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Getter @Setter
    private List<Contract> contracts;

    @Column( columnDefinition="tinyint(1) default 1" , name = "IsActive")
    protected  boolean IsActive;

    @Column( nullable = true, name = "DateCreated")
    protected Date DateCreated;

    public ContractType(Long contractTypeId, String name, String description, List<Contract> contracts, boolean isActive, Date dateCreated) {
        ContractTypeId = contractTypeId;
        Name = name;
        Description = description;
        this.contracts = contracts;
        IsActive = isActive;
        DateCreated = dateCreated;
    }
}
