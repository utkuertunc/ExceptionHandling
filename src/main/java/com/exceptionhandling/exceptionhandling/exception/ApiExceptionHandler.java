package com.exceptionhandling.exceptionhandling.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({EntityNotfoundException.class})
    public String entityNotFound() {
        return "Kayit Bulunamadi";
    }

    @ExceptionHandler({IllegalArgumentException.class})
    public String iaException() {
        return "Yanlis Parametre";
    }
}
