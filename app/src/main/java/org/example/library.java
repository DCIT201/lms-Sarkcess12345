package main.java.org.example;
import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    // Methods to add books and patrons
    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // Methods to check out and return books
    public void checkOutBook(Patron patron, Book book) {
        if (books.contains(book)) {
            patron.checkOutBook(book);
        } else {
            System.out.println("Book not found in library.");
        }
    }

    public void returnBook(Patron patron, Book book) {
        patron.returnBook(book);
    }
}
