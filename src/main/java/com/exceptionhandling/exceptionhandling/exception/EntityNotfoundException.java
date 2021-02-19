package com.exceptionhandling.exceptionhandling.exception;

public class EntityNotfoundException extends RuntimeException {
    public EntityNotfoundException(String param) {
        super(param);
    }
}