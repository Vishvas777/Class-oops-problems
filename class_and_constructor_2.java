// Book.java
class Book {
    // Private attributes
    private String title;
    private String author;
    private double price;

    // No-argument constructor
    public Book() {
        this.title = "Not Available";
        this.author = "Not Available";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to update book details
    public void setDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Bookstore.java
public class Bookstore {
    public static void main(String[] args) {
        // Create object using no-argument constructor
        Book book1 = new Book();
        System.out.println("Book Details (Default Constructor):");
        book1.displayDetails();
        System.out.println();

        // Create object using parameterized constructor
        Book book2 = new Book("The Java Handbook", "Patrick Naughton", 500.0);
        System.out.println("Book Details (Parameterized Constructor):");
        book2.displayDetails();
        System.out.println();

        // Update details of the first book
        book1.setDetails("Effective Java", "Joshua Bloch", 800.0);
        System.out.println("Updated Book Details:");
        book1.displayDetails();
    }
}