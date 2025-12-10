
import java.util.Scanner;

public class Book {
    // Members (attributes)
    private String name;
    private String author;
    private double price;
    private int numPages;

    // Constructor to initialize the values of the attributes
    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getNumPages() {
        return this.numPages;
    }

    // toString method to display book details
    public String toString() {
        return "Book Name: " + name + "\nAuthor: " + author + "\nPrice: $" + price + "\nNumber of Pages: " + numPages;
    }

    // Main method to create and display multiple Book objects based on user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of books from the user
        System.out.print("Enter the number of books you want to add: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left by nextInt()

        // Create an array to store the book objects
        Book[] books = new Book[n];

        // Loop through and take user input for each book
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter the name of the book: ");
            String name = scanner.nextLine();

            System.out.print("Enter the author of the book: ");
            String author = scanner.nextLine();

            System.out.print("Enter the price of the book: ");
            double price = scanner.nextDouble();

            System.out.print("Enter the number of pages of the book: ");
            int numPages = scanner.nextInt();
            scanner.nextLine();  // Consume the newline left by nextInt()

            // Create a new Book object with the provided details
            books[i] = new Book(name, author, price, numPages);
        }

        // Displaying the details of all books
        System.out.println("\nBook Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + " Details:");
            System.out.println(books[i].toString());
        }

        // Close the scanner
        scanner.close();
    }
}
