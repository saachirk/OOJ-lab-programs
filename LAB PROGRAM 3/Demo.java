import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;
    int num_pages;

    Book(String name, String author, int price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public String toString() {
        String name, author, price, num_pages;

        name = "Book name: " + this.name + "\n";

        author = "Author name: " + this.author + "\n";

        price = "Price: " + this.price + "\n";

        num_pages = "Number of pages: " + this.num_pages + "\n";

        return name + author + price + num_pages;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books : ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the name of book: ");
            String name = sc.nextLine();

            System.out.println("Enter the author of the book: ");
            String author = sc.nextLine();

            System.out.println("Enter price of book: ");
            int price = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            System.out.println("Enter the number of pages: ");
            int num_pages = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            books[i] = new Book(name, author, price, num_pages);
        }

        System.out.println("\nBooks entered:");
        for (int i = 0; i < books.length; i++) {
            System.out.println("--------------------");
            System.out.println(books[i]);  // implicitly calls toString()
        }

        sc.close();
    }
}
