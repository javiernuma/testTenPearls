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
import java.util.Date;

@Entity
@Table(name = "visits")
public class Visist {
    @Id
    @Column(name = "id_visits")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "date")
    private Date dateVisit;

    @Column(name = "net")
    private Long net;

    @Column(name = "visit_total")
    private Long visitTotal;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_client")
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public Long getNet() {
        return net;
    }

    public void setNet(Long net) {
        this.net = net;
    }

    public Long getVisitTotal() {
        return visitTotal;
    }

    public void setVisitTotal(Long visitTotal) {
        this.visitTotal = visitTotal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
