package com.banking.transactionlog.model.transactionrecord.gateways;

import com.banking.transactionlog.model.transactionrecord.TransactionRecord;

public interface RecordTransactionInputPort {
    TransactionRecord record(TransactionRecord transaction);
}
