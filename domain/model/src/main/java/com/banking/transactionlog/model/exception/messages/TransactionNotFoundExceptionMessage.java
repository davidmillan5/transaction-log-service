package com.banking.transactionlog.model.exception.messages;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransactionNotFoundExceptionMessage {

    TRANSACTION_NOT_FOUND_EXCEPTION_MESSAGE("TXN-404-001",
            404,
            "Transaction not found");


    private final String code;
    private final Integer status;
    private final String description;
}
