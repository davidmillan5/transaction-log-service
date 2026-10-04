package com.banking.transactionlog.model.exception;

public class InvalidTransactionFilterException extends RuntimeException {
    public InvalidTransactionFilterException(String message) {
        super(message);
    }
}
