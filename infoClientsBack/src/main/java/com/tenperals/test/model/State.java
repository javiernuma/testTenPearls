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
@Table(name = "state")
public class State {

    @Id
    @Column(name = "id_state")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "ds_name_state")
    private String nameState;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_country")
    private Country Country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    public com.tenperals.test.model.Country getCountry() {
        return Country;
    }

    public void setCountry(com.tenperals.test.model.Country country) {
        Country = country;
    }
}
