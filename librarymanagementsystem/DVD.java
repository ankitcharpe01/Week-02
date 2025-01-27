package com.encapsulationandpolymorphism.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable{
    public DVD(String itemId, String title, String author) {
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
        System.out.println("The DVD has been reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true;
    }
}
