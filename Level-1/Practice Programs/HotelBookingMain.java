class HotelBooking{
    // attributes of class
    private String guestName;
    private String roomType;
    private int nights;

    // default constructor
    HotelBooking(){
        guestName = "";
        roomType = "";
        nights = 0;
    }

    // parameterized constructor
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // copy constructor
    HotelBooking(HotelBooking booking){
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // method to display
    void displayBooking(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBookingMain {
    public static void main(String[] args) {
        // create a new booking using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        defaultBooking.displayBooking();
        System.out.println();

        // calling via parameterized constructor
        HotelBooking booking1 = new HotelBooking("John Doe", "Single", 3);
        booking1.displayBooking();
        System.out.println();

        // calling via copy constructor
        HotelBooking booking2 = new HotelBooking(booking1);
        booking2.displayBooking();
    }
}
