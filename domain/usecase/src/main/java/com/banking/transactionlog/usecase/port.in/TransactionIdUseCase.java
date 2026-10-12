package com.banking.transactionlog.usecase.port.in;

import com.banking.transactionlog.model.TransactionId;
import com.banking.transactionlog.model.exception.TransactionNotFoundException;
import com.banking.transactionlog.model.transactionrecord.TransactionRecord;
import com.banking.transactionlog.model.transactionrecord.gateways.TransactionRecordSearchRepository;

import java.util.Optional;

public class TransactionIdUseCase implements TransactionRecordSearchRepository {

    private final TransactionRecordSearchRepository transactionRecordSearchRepository;

    public TransactionIdUseCase(TransactionRecordSearchRepository transactionRecordSearchRepository) {
        this.transactionRecordSearchRepository = transactionRecordSearchRepository;
    }


    @Override
    public Optional<TransactionRecord> findById(TransactionId id) {
        return Optional.of(transactionRecordSearchRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException(id)));
    }
}
