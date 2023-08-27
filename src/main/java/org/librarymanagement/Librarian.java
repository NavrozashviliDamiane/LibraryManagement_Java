package org.librarymanagement;

public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void issueBook(Book book, Borrower borrower) {
        Transaction transaction = new Transaction(book, borrower);
        borrower.borrowBook(book, transaction);
    }

    public void returnBook(Book book, Borrower borrower) {
        Transaction transaction = borrower.returnBook(book);
        System.out.println("Book " + book.getTitle() + " has been returned by " + borrower.getName() +
                ". Transaction ID: " + transaction.getTransactionId());
    }
}
