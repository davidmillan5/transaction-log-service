package com.banking.transactionlog.model.transactionrecord.gateways;

import com.banking.transactionlog.model.AccountReference;
import com.banking.transactionlog.model.Page;
import com.banking.transactionlog.model.TransactionFilter;
import com.banking.transactionlog.model.transactionrecord.TransactionRecord;

public interface FindAccountTransactionsInputPort {
    Page<TransactionRecord> find(AccountReference accountId, TransactionFilter filter, int page, int size);
}
