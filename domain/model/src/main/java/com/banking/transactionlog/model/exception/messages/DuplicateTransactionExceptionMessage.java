package com.banking.transactionlog.model.exception.messages;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DuplicateTransactionExceptionMessage {

    DUPLICATE_TRANSACTION_EXCEPTION_MESSAGE("TXN-409-001",
            409,
            "Duplicate externalReference");


    private final String code;
    private final Integer status;
    private final String description;


}
