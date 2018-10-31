package com.vengard.recrutation.exception;

public class CurrencyNotFoundException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Waluta nie zostala znaleziona";
    }
}
