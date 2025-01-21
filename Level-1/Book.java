import java.util.Scanner;

public class Book {
    private static String libraryName;
    private String title;
    private String author;
    private final long isbn;

    public Book(String title, String author, long isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public static void displayLibraryName(String libraryName){
        System.out.println("The Library Name is: "+libraryName);
    }
    public void displayDetails(){
        System.out.println("The Title of the Book is : "+title+ "\nThe Author of the Book is : "+author+"\nThe isbn of the Book is : "+isbn);
    }
}

class UseBook{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Library Name: ");
        String libraryName = sc.nextLine();

        Book.displayLibraryName(libraryName);
        System.out.println("Enter Book title: ");
        String title = sc.nextLine();
        System.out.println("Enter Book author name: ");
        String author = sc.nextLine();
        System.out.println("Enter Book isbn:");
        long isbn = sc.nextLong();
        Book b = new Book(title,author,isbn);
        if(b instanceof Book) {
            System.out.println("Yes ! b is an instance of Book");
            b.displayDetails();
        }else{
            System.out.println("No! b is not an instance of Book");
        }

    }
}