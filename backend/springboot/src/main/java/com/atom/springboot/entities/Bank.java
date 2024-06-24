package com.atom.springboot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Entities represents the models in the Spring Boot application. 
// These models are also known as entity classes and they map to tables in the database.


// Indicates that this class is an entity and is mapped to a database table
@Entity
// Specifies the name of the database table to be used for mapping
@Table(name = "banks")
public class Bank {
    // Specifies the primary key of the entity and matches it to the specified column name in the DB
    @Id
    @Column(name = "bank_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bank_name")
    private String bankname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

}
