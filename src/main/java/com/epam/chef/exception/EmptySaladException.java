package com.epam.chef.exception;

public class EmptySaladException extends Exception {
    public EmptySaladException() {
    }

    public EmptySaladException(String message) {
        super(message);
    }

    public EmptySaladException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptySaladException(Throwable cause) {
        super(cause);
    }
}
