import java.util.ArrayList;
import java.util.List;

class Hospital{

    // doctor class inside hospital
    class Doctor{
        // Attributes for doctor
        private String name;
        private List<Patient> patients; // List for storing multiple patients for a doctor
        // constructor
        public Doctor(String name){
            this.name = name;
            this.patients = new ArrayList<>();
        }
        // getting name
        public String getName(){
            return name;
        }
        // adding patient for particular doctor
        public void addPatient(Patient patient) {
            patients.add(patient);
        }

        // checking if doctor is consulting with patients or not
        public void consult(Patient patient){
            System.out.println(name + " is consulting the patient: " + patient.getName());
        }

        // printing all patients for a particular doctor
        public void displayPatients() {
            System.out.println("Patients for doctor: " + this.name);
            for (Patient patient: patients) {
                System.out.println(patient.getName());
            }
        }
    }
    // class for patients
    class Patient{
        // Attributes of patient class
        private String name;
        private List<Doctor> doctors;

        // constructor for patients
        public Patient(String name){
            this.name = name;
            this.doctors = new ArrayList<>();
        }

        // getting name of a particular patient
        public String getName(){
            return name;
        }

        // adding doctor
        public void addDoctor(Doctor doctor){
            doctors.add(doctor);
        }

        // consulting with the doctor
        public void consult(Doctor doctor){
            System.out.println(name + " is consulting the doctor: " + doctor.getName());
        }

        // printing all doctors for a particular patient
        public void displayDoctors(){
            System.out.println("Doctors for Patient: " + name);
            for (Doctor doctor: doctors){
                System.out.println(doctor.getName());
            }
        }
    }
}
public class HospitalDoctorAndPatient {
    public static void main(String[] args) {
        // object creation for hospital
        Hospital hospital = new Hospital();

        // calling doctor and patient which is inside hospital
        Hospital.Doctor doctor1 = hospital.new Doctor("Dr. ABC");
        Hospital.Doctor doctor2 = hospital.new Doctor("Dr. XYZ");

        Hospital.Patient patient1 = hospital.new Patient("Alice");
        Hospital.Patient patient2 = hospital.new Patient("Bob");

        // method calling for adding patient
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // method calling for adding doctor for a particular patient
        patient1.addDoctor(doctor1);
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor1);

        // checking if doctor is consulting with the patients or not
        doctor1.consult(patient1);
        System.out.println();
        patient1.consult(doctor2);
        System.out.println();
        doctor1.displayPatients();
        System.out.println();
        patient1.displayDoctors();
    }
}