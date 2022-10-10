package com.example.bookstore.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "paper")
public class Paper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PaperId")
    private long paperId;

    @Column(name = "QualityName", nullable = false)
    private String qualityName;

    @Column(name = "PaperPrice", nullable = false)
    private BigDecimal paperPrice;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "paper")
    private List<Publisher> publishers;

    public Paper() {
    }

    public Paper(String qualityName, BigDecimal paperPrice) {
        this.qualityName = qualityName;
        this.paperPrice = paperPrice;
    }

    public long getPaperId() {
        return paperId;
    }

    public void setPaperId(long paperId) {
        this.paperId = paperId;
    }

    public String getQualityName() {
        return qualityName;
    }

    public void setQualityName(String qualityName) {
        this.qualityName = qualityName;
    }

    public BigDecimal getPaperPrice() {
        return paperPrice;
    }

    public void setPaperPrice(BigDecimal paperPrice) {
        this.paperPrice = paperPrice;
    }
}