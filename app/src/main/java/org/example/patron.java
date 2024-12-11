package main.java.org.example;



import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String patronId;
    private List<Book> checkedOutBooks;

    // Constructor
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.checkedOutBooks = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }

    public List<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public void checkOutBook(Book book) {
        if (!book.isCheckedOut()) {
            book.checkOut();
            checkedOutBooks.add(book);
            System.out.println(name + " has checked out " + book.getTitle());
        } else {
            System.out.println("Book is already checked out.");
        }
    }

    public void returnBook(Book book) {
        if (checkedOutBooks.contains(book)) {
            book.returnBook();
            checkedOutBooks.remove(book);
            System.out.println(name + " has returned " + book.getTitle());
        } else {
            System.out.println("You don't have this book.");
        }
    }
}



