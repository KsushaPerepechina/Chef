package com.epam.chef.exception;

public class IngredientParseException extends Exception {
    public IngredientParseException() {
    }

    public IngredientParseException(String message) {
        super(message);
    }

    public IngredientParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public IngredientParseException(Throwable cause) {
        super(cause);
    }
}
