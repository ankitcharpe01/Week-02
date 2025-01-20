class Course{
    // instance variables
    private String courseName;
    private int fee;
    private int duration;

    // class variable
    private static String instituteName = "LNCT";

    // constructor for initializing course details.
    public Course(String courseName, int fee, int duration){
        this.courseName = courseName;
        this.fee = fee;
        this.duration = duration;
    }

    // instance method to display course details.
    void displayCourseDetails(){
        System.out.println("Course details");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " years");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // class method
    public static void updateInstituteName(String name){
        instituteName = name;
        System.out.println("Institute updated successfully. New Institute Name: " + name);
    }
}

public class CourseMain {
    public static void main(String[] args) {
        // create objects of Course class
        Course c1 = new Course("B.Tech.", 50000, 4);
        c1.displayCourseDetails();
        System.out.println();

        Course c2 = new Course("M.Tech.", 60000, 2);
        c2.displayCourseDetails();
        System.out.println();
        Course.updateInstituteName("Technocrates institute of technology");
    }
}
