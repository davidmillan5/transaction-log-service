package com.banking.transactionlog.model.transactionrecord;


import com.banking.transactionlog.model.AccountReference;
import com.banking.transactionlog.model.Money;
import com.banking.transactionlog.model.TransactionId;
import com.banking.transactionlog.model.TransactionType;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@Setter
public class TransactionRecord {

    private TransactionId id;
    private AccountReference accountId;
    private UUID partyId;
    private TransactionType type;
    private Money amount;
    private Money balanceAfter;
    private String description;
    private String channel;
    private LocalDate valueDate;
    private Instant postedAt;
    private String externalReference;


}
