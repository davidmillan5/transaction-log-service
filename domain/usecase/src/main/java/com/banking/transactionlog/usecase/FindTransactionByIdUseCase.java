package com.banking.transactionlog.usecase;

import com.banking.transactionlog.model.TransactionId;
import com.banking.transactionlog.model.exception.TransactionNotFoundException;
import com.banking.transactionlog.model.exception.messages.TransactionNotFoundExceptionMessage;
import com.banking.transactionlog.model.transactionrecord.TransactionRecord;
import com.banking.transactionlog.model.transactionrecord.gateways.TransactionRecordSearchRepository;

import java.util.Optional;

public class FindTransactionByIdUseCase implements TransactionRecordSearchRepository {

    private final TransactionRecordSearchRepository transactionRecordSearchRepository;

    public FindTransactionByIdUseCase(TransactionRecordSearchRepository transactionRecordSearchRepository) {
        this.transactionRecordSearchRepository = transactionRecordSearchRepository;
    }


    @Override
    public Optional<TransactionRecord> findById(TransactionId id) {
        return Optional.of(transactionRecordSearchRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException(TransactionNotFoundExceptionMessage.TRANSACTION_NOT_FOUND_EXCEPTION_MESSAGE)));
    }
}
