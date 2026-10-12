package com.banking.transactionlog.usecase.port.in;

import com.banking.transactionlog.model.transactionrecord.TransactionRecord;

public interface RecordTransactionInputPort {

    TransactionRecord record(TransactionRecord transaction);


}
