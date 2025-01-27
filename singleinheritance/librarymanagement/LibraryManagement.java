package com.inheritance.singleinheritance.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {
        Book book1;
        book1= new Author("JAVA",1996,"Jame's Gosling","Father of Java is Jame's Gosling");
        book1.displayInfo();

        System.out.println();
        Book book2;
        book2= new Author("C++",1978,"Bjarne Stroustrup","Father of C++ is Bjarne Stroustrup ");
        book2.displayInfo();

    }
}