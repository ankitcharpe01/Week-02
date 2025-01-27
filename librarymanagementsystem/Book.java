package com.encapsulationandpolymorphism.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable{
    private int duration;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public void getLoanDuration(int duration) {
        setDuration(duration);
    }
    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Loan Duration : "+getDuration());
    }

    @Override
    public void reserveItem() {
        System.out.println("The book has been reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true; // Placeholder for actual availability logic
    }
}

