package com.inheritance.singleinheritance.librarymanagement;


class Book{
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear= publicationYear;
    }

    public void displayInfo(){
        System.out.println("The Title of the Book is: "+title);
        System.out.println("The Publication Year of the Book is: "+publicationYear);
    }
}
