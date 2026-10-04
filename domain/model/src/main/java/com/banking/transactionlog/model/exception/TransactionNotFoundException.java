package com.banking.transactionlog.model.exception;


import com.banking.transactionlog.model.exception.messages.TransactionNotFoundExceptionMessage;
import lombok.Getter;

@Getter
public class TransactionNotFoundException extends RuntimeException {

    private final TransactionNotFoundExceptionMessage transactionNotFoundExceptionMessage;
    private final Integer status;
    private final String code;


    public TransactionNotFoundException(TransactionNotFoundExceptionMessage transactionNotFoundExceptionMessage, Integer status, String code) {
        super(transactionNotFoundExceptionMessage.getDescription());
        this.transactionNotFoundExceptionMessage = transactionNotFoundExceptionMessage;
        this.status = status;
        this.code = code;
    }

    public TransactionNotFoundException(TransactionNotFoundExceptionMessage transactionNotFoundExceptionMessage,
                                        String description, Integer status, String code){
        super(description);
        this.transactionNotFoundExceptionMessage = transactionNotFoundExceptionMessage;
        this.status = status;
        this.code = code;
    }


}

