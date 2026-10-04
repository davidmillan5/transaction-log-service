package com.banking.transactionlog.model;


import java.util.UUID;

public record AccountReference(UUID accountId, String productType) {
}
