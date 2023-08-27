package org.librarymanagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Magazine magazine = new Magazine("National Geographic", "Various", "July 2023");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(magazine);

        library.displayBooks();

        Borrower borrower1 = new Borrower("Alice");
        Borrower borrower2 = new Borrower("Bob");

        Librarian librarian = new Librarian("Emily");

        librarian.issueBook(book1, borrower1);
        librarian.issueBook(magazine, borrower2);

        librarian.returnBook(book1, borrower1);
    }
}

