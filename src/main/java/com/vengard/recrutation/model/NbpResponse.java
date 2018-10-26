package com.vengard.recrutation.model;

import java.util.List;

public class NbpResponse {

    private String table;
    private String currency;
    private String code;
    private List<Rate> rates;

    public NbpResponse() {
    }

    public NbpResponse(String table, String currency, String code, List<Rate> rates) {
        this.table = table;
        this.currency = currency;
        this.code = code;
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public List<Rate> getRates() {
        return rates;
    }
}
