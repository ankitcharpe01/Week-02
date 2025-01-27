package com.encapsulationandpolymorphism.librarymanagementsystem;

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean available;
    private int duration;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.available=true;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public abstract void getLoanDuration(int duration);

    public void getItemDetails() {
        System.out.println("ID: " + itemId + "\nTitle: " + title + "\nAuthor: " + author);
    }

    public void reserveItem() {
        available = false;
    }

    public boolean checkAvailability() {
        boolean ans=isAvailable();
        if(isAvailable())
            setAvailable(false);
        return ans;
    }
}
