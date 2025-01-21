public class Vehicle {
    private  String ownerName;
    private String vehicleType;
    private  final int registrationNumber ;

    private static int registrationFee   =50000;

    //initialization of instance variable
    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    //create a method for update registration fees
    public static void updateRegistrationFee(int newRegistrationFees) {
        registrationFee=newRegistrationFees;
    }

    //create a method to display details
    public void displayVehicleDetails(){
        System.out.println("The owner name is "+ownerName);
        System.out.println("The vehicle Type is "+vehicleType);
        System.out.println("The registration Number  is "+registrationNumber );
        System.out.println("The registration Fee  is "+registrationFee );

    }
}

class UseVehicle{
    public static void main(String[] args) {
        Vehicle v1= new Vehicle("car " ,"abc" ,20002);
        Vehicle v2= new Vehicle("Bus " ,"xyz" ,30003);
        if(v1 instanceof Vehicle){
            System.out.println("Vehicle 1");
            System.out.println("yes v1 is instance of Vehicle");
            Vehicle.updateRegistrationFee(20000);
            v1.displayVehicleDetails();
        }
        System.out.println(" ");
        if(v2 instanceof Vehicle){
            System.out.println("Vehicle 2");
            System.out.println("yes v2 is instance of Vehicle");
            Vehicle.updateRegistrationFee(10000);
            v2.displayVehicleDetails();
        }
    }
}