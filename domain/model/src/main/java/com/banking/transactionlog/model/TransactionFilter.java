package com.banking.transactionlog.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public record TransactionFilter(Optional<LocalDate> dateFrom, Optional<LocalDate> dateTo,
                                Optional<TransactionType> type, Optional<BigDecimal> minAmount,
                                Optional<BigDecimal> maxAmount
) {
}
