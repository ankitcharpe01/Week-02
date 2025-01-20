import java.util.Scanner;
 public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("The Title of the book is: "+title);
        System.out.println("The Author of the book is: "+author);
        System.out.println("The Price of the book is: "+price);
    }
}

class UseBook{
    public static void main(String[] args) {
        Book object1 = new Book("Let us Java","Yashavant Kanetkar",999.0);
        Book object2  = new Book("C++"," E. Balagurusamy",799.0);
        object1.displayDetails();
        object2.displayDetails();
    }
}
