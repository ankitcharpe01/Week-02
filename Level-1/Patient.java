public class Patient {

    private  String name;
    private int age;
    private  final int patientId ;
    private static String hospitalName  ="Bansal Hospital";
    private static int noOfPatients;
    private String ailment;

    public Patient(String name, int age, int patientId, String ailment) {
        this.name = name;
        this.age = age;
        this.patientId = patientId;
        this.ailment = ailment;
        noOfPatients++;
    }

    public static int getTotalPatients(){
        return noOfPatients;
    }
    public void displayPatientDetails(){
        System.out.println("The hospital Name is "+hospitalName);
        System.out.println("The Patient name is "+name);
        System.out.println("The Patient age  is "+age);
        System.out.println("The Patient id is "+patientId);
        System.out.println("The ailment  "+ailment );
    }
}

 class UsePatient{
    public static void main(String[] args) {
        Patient p1=new Patient("Rashmi" , 20 , 1001 , "Headache");
        Patient p2=new Patient("Neelam" , 22 , 2002 , "cancer");
        if(p1 instanceof Patient){
            System.out.println("Patient 1");
            System.out.println("yes p1 is instance of patient");
            p1.displayPatientDetails();

        }
        if(p2 instanceof Patient){
            System.out.println("\nPatient 2");
            System.out.println("yes p2 is instance of patient");
            p2.displayPatientDetails();
        }
        System.out.println("The total number of patient in hospital are "+Patient.getTotalPatients());

    }
}