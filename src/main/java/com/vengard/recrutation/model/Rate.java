package com.vengard.recrutation.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Rate {

    private String no;

    @JsonFormat(pattern = "yyyy-mm-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate effectiveDate;

    @JsonProperty("bid")
    private float buyRate;

    @JsonProperty("ask")
    private float sellRate;

    public Rate() {
    }

    public Rate(String no, LocalDate effectiveDate, float buyRate, float sellRate) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }

    public String getNo() {
        return no;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public float getBuyRate() {
        return buyRate;
    }

    public float getSellRate() {
        return sellRate;
    }
}
