package com.banking.transactionlog.model;

import java.util.UUID;

public record TransactionId(UUID value) {
    public static TransactionId generate() {
        return new TransactionId(UUID.randomUUID());
    }
}
