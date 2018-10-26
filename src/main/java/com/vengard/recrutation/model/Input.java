package com.vengard.recrutation.model;

import org.joda.time.LocalDate;

import javax.validation.constraints.PastOrPresent;

public class Input {

    private Currency currency;

    @PastOrPresent
    private LocalDate startDate;
    @PastOrPresent
    private LocalDate endDate;

    public Input() {
    }

    public Input(Currency currency, @PastOrPresent LocalDate startDate, @PastOrPresent LocalDate endDate) {
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
