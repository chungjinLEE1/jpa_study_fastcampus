package com.example.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;




}
