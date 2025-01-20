import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(){}
    public Book(String title, String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void display(){
        System.out.println("The Title of the book is "+title+ "\nThe Author of the book is  "+author+"\nThe price of the boo is "+price);
    }
}

class UseBook{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of title: ");
        String title =sc.nextLine();

        System.out.println("Enter the author name ");
        String author =sc.nextLine();

        System.out.println("Enter the price of the book ");
        double price= sc.nextDouble();

        Book b = new Book(title ,author,price);
        b.display();
    }
}