package org.example;

public class App {
    public static void main(String[] args) {
        // Create library and patrons
        Library library = new Library();
        Patron patron1 = new Patron("Alice", "P001");
        Patron patron2 = new Patron("Bob", "P002");

        // Add patrons to library
        library.addPatron(patron1);
        library.addPatron(patron2);

        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456");
        Book book2 = new Book("Moby Dick", "Herman Melville", "654321");

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);

        // Simulate operations
        library.checkOutBook(patron1, book1);
        library.checkOutBook(patron2, book2);
        library.returnBook(patron1, book1);
        library.checkOutBook(patron1, book2);
    }
}
