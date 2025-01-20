class Book {
    // instance variable
    public String ISBN;
    protected String title;
    private String author;

    // constructor calling for initializing values
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // setting author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // getting author name
    public String getAuthor() {
        return this.author;
    }

    // displaying result
    void displayResult(){
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}

class EBook extends Book {
    // constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // displaying result
    void displaying(){
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Title: " + this.title);
        System.out.println("Author name: " + getAuthor());        
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        // creating an object of Book class
        Book book = new Book("1234567890", "Book Title", "John Doe");
        book.displayResult();
        System.out.println();
        // setting author name
        book.setAuthor("Jane Doe");
        book.displayResult();
        System.out.println();

        // creating an object of EBook class
        EBook ebook = new EBook("9876543210", "EBook Title", "Ankur");
        ebook.displaying();
    }
}
