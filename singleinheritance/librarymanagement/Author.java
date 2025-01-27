package com.inheritance.singleinheritance.librarymanagement;

class Author extends Book{
    private String name;
    private String bio;

    public Author(String title, int publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The Name of the Author is: "+name);
        System.out.println("Bio: "+bio);
    }
}
