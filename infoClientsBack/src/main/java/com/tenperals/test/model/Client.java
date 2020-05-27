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
@Table (name = "clients")
public class Client {
    @Id
    @Column(name = "id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long id;

    @Column(name = "nit")
    String nit;

    @Column(name = "full_name")
    String fullName;

    @Column(name = "address")
    String address;

    @Column(name = "phone")
    String phone;

    @Column(name = "credit_limit")
    Long creditLimit;

    @Column(name = "avaliable_credit")
    Long avaliableCredit;

    @Column(name = "visit_percentage")
    int visitPercentage;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_city")
    private City city;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Long getAvaliableCredit() {
        return avaliableCredit;
    }

    public void setAvaliableCredit(Long avaliableCredit) {
        this.avaliableCredit = avaliableCredit;
    }

    public int getVisitPercentage() {
        return visitPercentage;
    }

    public void setVisitPercentage(int visitPercentage) {
        this.visitPercentage = visitPercentage;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

