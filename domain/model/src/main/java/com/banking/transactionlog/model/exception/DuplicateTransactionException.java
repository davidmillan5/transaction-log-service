package com.banking.transactionlog.model.exception;

import com.banking.transactionlog.model.exception.messages.DuplicateTransactionExceptionMessage;

public class DuplicateTransactionException extends RuntimeException {


    private final DuplicateTransactionExceptionMessage duplicateTransactionExceptionMessage;
    private final Integer status;
    private final String code;


    public DuplicateTransactionException(DuplicateTransactionExceptionMessage duplicateTransactionExceptionMessage, Integer status, String code) {
        super(duplicateTransactionExceptionMessage.getDescription());
        this.duplicateTransactionExceptionMessage = duplicateTransactionExceptionMessage;
        this.status = status;
        this.code = code;
    }


    public DuplicateTransactionException(DuplicateTransactionExceptionMessage duplicateTransactionExceptionMessage,
                                         String description, Integer status, String code){
        super(description);
        this.duplicateTransactionExceptionMessage = duplicateTransactionExceptionMessage;
        this.status = status;
        this.code = code;
    }



}
