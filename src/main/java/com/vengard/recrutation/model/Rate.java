package com.vengard.recrutation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Rate {

    @JsonProperty("no")
    private String numberOf;

    private LocalDate effectiveDate;

    @JsonProperty("bid")
    private float buyRate;

    @JsonProperty("ask")
    private float sellRate;

    public Rate() {
    }

    public Rate(String numberOf, LocalDate effectiveDate, float buyRate, float sellRate) {
        this.numberOf = numberOf;
        this.effectiveDate = effectiveDate;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }

    public String getNumberOf() {
        return numberOf;
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
