package com.metaphorce.test.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User {
    // use lombok for implement getter and setters
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "id")
    @Getter @Setter
    private Integer id;

    @Getter @Setter @Column(name = "name")
    private  String name;

    @Getter @Setter @Column(name = "firstName")
    private  String firstName;

    @Getter @Setter  @Column(name = "lastName")
    private  String lastName;

    @Getter @Setter
    private  String password;

    // default constructor
    public User(){ }

    public User( String name, String firstName, String lastName, String phoneNumber, String password) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
}
