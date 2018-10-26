package com.vengard.recrutation.rest;

import com.vengard.recrutation.exception.BadDataInputException;
import com.vengard.recrutation.exception.CurrencyNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(CurrencyNotFoundException.class)
    public ResponseEntity<Object> handleCurrencyNotFoundException(CurrencyNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadDataInputException.class)
    public ResponseEntity<Object> handleBadDataInputException(BadDataInputException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
