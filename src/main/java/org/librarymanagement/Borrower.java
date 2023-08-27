package org.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;
    private List<Transaction> borrowedTransactions;

    public Borrower(String name) {
        this.name = name;
        borrowedTransactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book, Transaction transaction) {
        borrowedTransactions.add(transaction);
        System.out.println(name + " has borrowed the book: " + book.getTitle());
    }

    public Transaction returnBook(Book book) {
        for (Transaction transaction : borrowedTransactions) {
            if (transaction.getBook() == book) {
                borrowedTransactions.remove(transaction);
                return transaction;
            }
        }
        return null;
    }
}
