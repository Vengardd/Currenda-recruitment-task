package com.vengard.recrutation.exception;

public class NoDataException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Brak danych";
    }
}
