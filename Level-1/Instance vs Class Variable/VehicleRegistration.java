class Vehicle{
    // class variable
    static int registrationFee = 1000;

    // instance variables
    String ownerName;
    String vehicleType;

    // initializing constructor
    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method for displaying fee
    void displayVehicleDetails(){
        System.out.println("Vehicle details");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Fee: " + registrationFee);
    }

    // class method for updating fee
    static void updateRegistrationFee(int newFee){
        registrationFee = newFee;
        System.out.println("Fee updated successfully. \nNew registration fee is: " + registrationFee);
    }
}

public class VehicleRegistration {

    public static void main(String[] args) {
        // creating objects
        Vehicle vehicle1 = new Vehicle("John", "Car");
        vehicle1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2000);

    }
}
