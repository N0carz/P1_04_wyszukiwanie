package com.sda.exercises.exceptions;

public class NoElementException extends Exception{
    private String message;

    public NoElementException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "NoElementException: " + this.message;
    }
}
