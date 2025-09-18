public class Book {
    // Static variable shared across all Book instances
    private static String libraryName = "City Central Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final ensures immutability

    // Constructor using 'this' keyword
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to safely return ISBN using instanceof
    public static String getIsbnIfBook(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            return b.isbn;
        } else {
            return "Not a valid Book object";
        }
    }

    // Optional: Display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
