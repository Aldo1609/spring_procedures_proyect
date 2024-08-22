package com.aldob.legacy_funciton.exception;

public class PersonServiceException extends RuntimeException {
    public PersonServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
