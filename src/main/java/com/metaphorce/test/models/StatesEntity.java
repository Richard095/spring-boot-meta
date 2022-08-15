package com.metaphorce.test.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class StatesEntity {

    @Getter @Setter
    @Column( columnDefinition="tinyint(1) default 1" , name = "IsActive")
    protected  boolean IsActive;

    @Column( nullable = true, name = "DateCreated")
    @Getter @Setter
    protected Date DateCreated;

    public StatesEntity(boolean isActive, Date dateCreated) {
        IsActive = isActive;
        DateCreated = dateCreated;
    }
}
