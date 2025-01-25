import java.util.ArrayList;
import java.util.List;


class Book{
    //Attributes of the book
    private String title;
    private String author;

    //Initialization
    public Book(String title , String author){
        this.title=title;
        this.author=author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
}


class Library{
    //Attribute to store the list of books in the library
    private List<Book> books;//aggregation
    private String name;

    public Library(String name ){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    //Display books author and title
    public void showALlBooks(){
        System.out.println("Library: " + name);
        for(Book book: books){
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

//main class
public class LibraryAndBookAggregation {
    public static void main(String[] args) {
        Library library = new Library("Central Library");
        Book book = new Book("JAVA","Yashvant Kanitkar");
        Book book2 = new Book("C++","G.Balaguruswami");

        library.addBook(book);
        library.addBook(book2);

        library.showALlBooks();
    }
}
