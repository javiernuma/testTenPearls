package com.tenperals.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salesrepresentative")
public class SalesRepresentative {
    @Id
    @Column(name = "id_sales_representative")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "ds_name")
    private String nameRepresentative;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRepresentative() {
        return nameRepresentative;
    }

    public void setNameRepresentative(String nameRepresentative) {
        this.nameRepresentative = nameRepresentative;
    }
}
