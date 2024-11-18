package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class SoapFaultExceptionHandler {

    @ExceptionHandler(Exception.class)
    public void handleException(Exception ex) {
        // Log the exception
        System.err.println("Error processing request: " + ex.getMessage());
    }
}