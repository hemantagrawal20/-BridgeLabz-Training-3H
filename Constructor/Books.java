package Constructor;

public class Books {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
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

    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();
        b1.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 599.99);
        b2.displayDetails();
    }
    
}
