package com.banking.transactionlog.usecase.port.in;

import com.banking.transactionlog.model.exception.DuplicateTransactionException;
import com.banking.transactionlog.model.transactionrecord.TransactionRecord;
import com.banking.transactionlog.model.transactionrecord.gateways.RecordTransactionInputPort;
import com.banking.transactionlog.model.transactionrecord.gateways.TransactionRepository;

public class RecordTransactionUseCase implements RecordTransactionInputPort {

    private final RecordTransactionInputPort recordTransactionInputPort;
    private final TransactionRepository transactionRepository;

    public RecordTransactionUseCase(RecordTransactionInputPort recordTransactionInputPort, TransactionRepository transactionRepository) {
        this.recordTransactionInputPort = recordTransactionInputPort;
        this.transactionRepository = transactionRepository;
    }


    @Override
    public TransactionRecord record(TransactionRecord transaction) {
        if(transactionRepository.existsByExternalReference("exists").equals(transaction)){
            return new DuplicateTransactionException();
        }else{
            return recordTransactionInputPort.record(transaction);
        }


    }
}
