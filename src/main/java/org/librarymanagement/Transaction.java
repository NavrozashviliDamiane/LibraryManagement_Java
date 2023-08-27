package org.librarymanagement;

import java.util.Date;

public class Transaction {
    private static int transactionCounter = 0;
    private int transactionId;
    private Book book;
    private Borrower borrower;
    private Date transactionDate;

    public Transaction(Book book, Borrower borrower) {
        this.book = book;
        this.borrower = borrower;
        this.transactionDate = new Date();
        this.transactionId = ++transactionCounter;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Book getBook() {
        return book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
}