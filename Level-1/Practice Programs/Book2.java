public class Book2{
    // defining attributes
    private String title;
    private String author;
    private double price;
    private boolean availability;

    Book2(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            System.out.println("Book borrowed successfully.");
            System.out.println("Book details");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: $" + price);
        }
        else {
            System.out.println("Book is not available.");
            System.out.println("Book details");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: $" + price);
        }
    }
}

class UseBook2{
    public static void main(String[] args) {
        Book2 book = new Book2("Harry Potter", "J.K. Rowling", 20.0, true);
        book.borrowBook();
    }
}
