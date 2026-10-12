package com.banking.transactionlog.model.transactionrecord.gateways;

import com.banking.transactionlog.model.AccountReference;
import com.banking.transactionlog.model.Page;
import com.banking.transactionlog.model.TransactionFilter;
import com.banking.transactionlog.model.TransactionId;
import com.banking.transactionlog.model.transactionrecord.TransactionRecord;

import java.util.Optional;

public interface TransactionRepository {
    TransactionRecord save(TransactionRecord transaction);
    Optional<TransactionRecord> findById(TransactionId id);
    Boolean existsByExternalReference(String externalReference);
    Page<TransactionRecord> findByAccount(AccountReference accountId, TransactionFilter filter, int page, int size);


}
