package com.vengard.recrutation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String currency;

    @Size(min = 3, max = 3)
    private String code;

    public Currency() {
    }

    public Currency(String currency, @Size(min = 3, max = 3) String code) {
        this.currency = currency;
        this.code = code;
    }
}
