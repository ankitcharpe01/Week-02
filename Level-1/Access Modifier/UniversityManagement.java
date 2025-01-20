class Student {
    // initializing variables with access modifiers
    public int rollNumber;
    protected String name;
    private double CGPA;

    // constructor for initializing values
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // getters and setters for accessing private variables
    public double getCGPA() {

        return this.CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // method for displaying result
    void displayResult() {
        System.out.println("Under graduate student detail");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// subclass for using the protected keyword
class PostgraduateStudent extends Student {
    // subclass constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA); // for taking the values from the base class
    }


    // subclass method for displaying result
    void displayPostgraduateResult() {
        System.out.println("Post graduate student detail");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());

    }
}

// main class
public class UniversityManagement{
    public static void main(String[] args) {
        // creating and initialing objects
        Student st1 = new Student(123, "Ram", 8.75);
        st1.displayResult(); // displaying result
        st1.setCGPA(9.0);
        System.out.println();

        // 
        PostgraduateStudent pg1 = new PostgraduateStudent(125, "Shyam", 8.9);
        pg1.displayPostgraduateResult();
    }
}