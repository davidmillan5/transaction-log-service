package com.banking.transactionlog.usecase.port.in;

import com.banking.transactionlog.model.TransactionId;
import com.banking.transactionlog.model.transactionrecord.TransactionRecord;

public interface FindTransactionByIdInputPort {

    TransactionRecord findById(TransactionId id);

}
