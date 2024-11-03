package com.example.ignacio.crud_university.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_students")
public class Student {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    @Column(name = "email_address",nullable = false,unique = true)
    private String email;
}
