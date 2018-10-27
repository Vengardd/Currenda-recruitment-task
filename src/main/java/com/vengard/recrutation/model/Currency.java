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

    private String name;

    @Size(min = 3, max = 3)
    private String code;

    public Currency() {
    }

    public Currency(String name, @Size(min = 3, max = 3) String code) {
        this.name = name;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }


    public static final class CurrencyBuilder {
        private Long id;
        private String name;
        private String code;

        private CurrencyBuilder() {
        }

        public static CurrencyBuilder aCurrency() {
            return new CurrencyBuilder();
        }

        public CurrencyBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public CurrencyBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CurrencyBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public Currency build() {
            Currency currency = new Currency(name, code);
            currency.id = this.id;
            return currency;
        }
    }
}
