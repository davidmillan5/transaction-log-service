package com.banking.transactionlog.model.transactionrecord.gateways;


import com.banking.transactionlog.model.TransactionId;
import com.banking.transactionlog.model.transactionrecord.TransactionRecord;

import java.util.Optional;


public interface TransactionRecordSearchRepository {
    Optional<TransactionRecord> findById(TransactionId id);
}
