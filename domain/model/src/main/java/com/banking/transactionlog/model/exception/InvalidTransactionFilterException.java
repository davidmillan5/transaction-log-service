package com.banking.transactionlog.model.exception;

import com.banking.transactionlog.model.exception.messages.InvalidTransactionFilterExceptionMessage;

public class InvalidTransactionFilterException extends RuntimeException {

    private final InvalidTransactionFilterExceptionMessage invalidTransactionFilterExceptionMessage;
    private final Integer status;
    private final String code;


    public InvalidTransactionFilterException(InvalidTransactionFilterExceptionMessage invalidTransactionFilterExceptionMessage, Integer status, String code) {
        super(invalidTransactionFilterExceptionMessage.getDescription());
        this.invalidTransactionFilterExceptionMessage = invalidTransactionFilterExceptionMessage;
        this.status = status;
        this.code = code;
    }

    public InvalidTransactionFilterException(InvalidTransactionFilterExceptionMessage invalidTransactionFilterExceptionMessage,
                                             String description, Integer status, String code){
        super(description);
        this.invalidTransactionFilterExceptionMessage = invalidTransactionFilterExceptionMessage;
        this.status = status;
        this.code = code;
    }



}
