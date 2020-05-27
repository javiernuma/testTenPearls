package com.tenperals.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "id_country")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "ds_name_country")
    private String nameCountry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }
}
