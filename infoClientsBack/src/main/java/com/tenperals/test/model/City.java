package com.tenperals.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "id_city")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "ds_name_city")
    private String nameCity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_state")
    private State state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
