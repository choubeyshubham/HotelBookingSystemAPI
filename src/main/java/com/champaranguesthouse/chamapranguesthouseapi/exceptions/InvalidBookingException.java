package com.champaranguesthouse.chamapranguesthouseapi.exceptions;

public class InvalidBookingException extends RuntimeException {
    public InvalidBookingException(String message) {
        super(message);
    }
}
