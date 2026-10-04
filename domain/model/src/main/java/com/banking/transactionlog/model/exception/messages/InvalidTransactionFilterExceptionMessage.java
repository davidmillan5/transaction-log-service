package com.banking.transactionlog.model.exception.messages;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InvalidTransactionFilterExceptionMessage {

    INVALID_TRANSACTION_FILTER_EXCEPTION_MESSAGE("TXN-400-001",
            400,
            "Invalid filter (inverted date or amount range)");


    private final String code;
    private final Integer status;
    private final String description;

}
