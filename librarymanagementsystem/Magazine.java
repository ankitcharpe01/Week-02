package com.encapsulationandpolymorphism.librarymanagementsystem;
public class Magazine extends LibraryItem implements Reservable{
    public Magazine(String itemId, String title, String author) {
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
        System.out.println("The magazine has been reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return false; // Placeholder for actual availability logic
    }
}

