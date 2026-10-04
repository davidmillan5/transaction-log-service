package com.banking.transactionlog.model.transactionrecord.gateways;

import com.banking.transactionlog.model.transactionrecord.TransactionRecord;

import java.math.BigDecimal;

public interface TransactionClassifier {
    BigDecimal signedAmount(TransactionRecord record);
}
