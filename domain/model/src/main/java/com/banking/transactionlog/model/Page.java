package com.banking.transactionlog.model;

import java.util.List;

public class Page<T> {
    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
}
