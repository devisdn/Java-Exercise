package com.example.bookstore.dtos;

import java.math.BigDecimal;

public class PaperDTO {
    private long paperId;
    private String qualityName;
    private BigDecimal paperPrice;
    
    public PaperDTO() {
    }

    public PaperDTO(long paperId, String qualityName, BigDecimal paperPrice) {
        this.paperId = paperId;
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
