package com.vengard.recrutation.exception;

public class BadDataInputException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Zle podane dane";
    }
}
