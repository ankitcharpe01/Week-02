public class Student {
    private static String universityName="Technocrats Institute of Technology";
    private static int totalStudent;
    private String name;
    private final int rollNumber;
    private char grade;

    //Initialization of instance variable
    public Student( String name,int rollNumber ,char grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade=grade;
        totalStudent++;
    }

    //Create a method to display total students
    public static void displayTotalStudent(){
        System.out.println("The Total Number of Student Enrolled: "+totalStudent);
    }

    //Create a method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Enrollment :"+rollNumber);
        System.out.println("Student Name: "+name);
        System.out.println("Student Grade: "+grade);
    }
}

class UseStudent{
    //main method
    public static void main(String[] args) {
        //create instance of a class Student
        Student s1= new Student("Ankit" , 101, 'A' );
        Student s2= new Student("Ayushmaan" , 102, 'A' );
        System.out.println("Student 1");
        if(s1 instanceof Student) {
            System.out.println("Yes s1 is an instance of Student");
            s1.displayStudentDetails();
        }

        System.out.println("\nStudent 2");
        if(s2 instanceof Student) {
            System.out.println("Yes s2 is an instance of Student");
            s2.displayStudentDetails();
        }
        Student.displayTotalStudent();
    }
}
