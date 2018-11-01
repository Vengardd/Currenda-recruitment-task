package com.vengard.recrutation.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class Input {

    private String currency;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    public Input() {
    }

    public Input(String currency, LocalDate startDate, LocalDate endDate) {
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
        System.out.println(LocalDate.parse("2018-01-01"));
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
