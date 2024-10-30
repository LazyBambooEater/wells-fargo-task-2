package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "clientId")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> security;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(long clientId, String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portflioId;
    }


    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }
}