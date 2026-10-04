package com.banking.transactionlog.model.transactionrecord.gateways;

import com.banking.transactionlog.model.Money;

import java.math.BigDecimal;
import java.util.Currency;

public interface MoneyRepository {
    Money of(BigDecimal amount, Currency currency);
}
