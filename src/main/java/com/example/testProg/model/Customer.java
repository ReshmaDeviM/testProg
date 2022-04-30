package com.example.testProg.model;

import lombok.*;

import javax.persistence.*;


@Data
@Table(name = "customer")
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "total_bill")
    private int total_bill;

}
