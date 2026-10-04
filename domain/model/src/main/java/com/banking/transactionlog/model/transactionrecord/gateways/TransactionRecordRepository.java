package com.banking.transactionlog.model.transactionrecord.gateways;

import com.banking.transactionlog.model.transactionrecord.TransactionRecord;

public interface TransactionRecordRepository {
    TransactionRecord isDebit();
    TransactionRecord isCredit();
}
