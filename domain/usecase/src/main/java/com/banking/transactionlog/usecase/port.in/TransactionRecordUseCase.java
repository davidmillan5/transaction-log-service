package com.banking.transactionlog.usecase.port.in;

import com.banking.transactionlog.model.transactionrecord.TransactionRecord;
import com.banking.transactionlog.model.transactionrecord.gateways.RecordTransactionInputPort;


public class TransactionRecordUseCase implements RecordTransactionInputPort {

    private final RecordTransactionInputPort recordTransactionInputPort;

    public TransactionRecordUseCase(RecordTransactionInputPort recordTransactionInputPort) {
        this.recordTransactionInputPort = recordTransactionInputPort;
    }


    @Override
    public TransactionRecord record(TransactionRecord transaction) {
        return recordTransactionInputPort.record(transaction);
    }
}
