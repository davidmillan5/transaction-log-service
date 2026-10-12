package com.banking.transactionlog.usecase.port.in;

import com.banking.transactionlog.model.AccountReference;
import com.banking.transactionlog.model.Page;
import com.banking.transactionlog.model.TransactionFilter;
import com.banking.transactionlog.model.transactionrecord.TransactionRecord;
import com.banking.transactionlog.model.transactionrecord.gateways.FindAccountTransactionsInputPort;

public class FindAccountTransactionUseCase implements FindAccountTransactionsInputPort {

    private final FindAccountTransactionsInputPort findAccountTransactionsInputPort;

    public FindAccountTransactionUseCase(FindAccountTransactionsInputPort findAccountTransactionsInputPort) {
        this.findAccountTransactionsInputPort = findAccountTransactionsInputPort;
    }


    @Override
    public Page<TransactionRecord> find(AccountReference accountId, TransactionFilter filter, int page, int size) {
        return
                findAccountTransactionsInputPort.find(accountId,
                        filter,
                        page,
                        size);
    }
}
