import java.util.ArrayList;
import java.util.List;

// Student class
class Student2 {
    private int rollNumber;
    private String name;
    private List<Courses> enrolledCourses;

    public Student2(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Enroll student in a course
    public void enrollInCourse(Courses course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    // Display all enrolled courses
    public void showAllCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Courses course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Professor class
class Professor {
    private String name;
    private int id;
    private List<Courses> assignedCourses;

    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
        this.assignedCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Assign professor to a course
    public void assignCourse(Courses course) {
        assignedCourses.add(course);
        course.assignProfessor(this);
    }

    // Display all assigned courses
    public void displayCourses() {
        System.out.println(name + " is teaching the following courses:");
        for (Courses course : assignedCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Courses class
class Courses {
    private String courseName;
    private int courseCode;
    private Professor professor;
    private List<Student2> enrolledStudents;

    public Courses(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student2 student) {
        enrolledStudents.add(student);
    }

    // Display course details
    public void displayDetails() {
        System.out.println("\nCourse: " + courseName + " (Code: " + courseCode + ")");
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor is  Not Assigned");
        }
        System.out.println("Enrolled Students: ");
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled ");
        } else {
            for (Student2 student : enrolledStudents) {
                System.out.println("- " + student.getName() + " (Roll No: " + student.getRollNumber() + ")");
            }
        }
    }
}

// Main class for execution
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating students
        Student2 student1 = new Student2(101, "Ankitt");
        Student2 student2 = new Student2(102, "Rahul");

        // Creating professors
        Professor professor1 = new Professor("Dr. Shyam", 201);
        Professor professor2 = new Professor("Dr. Mohan", 202);

        // Creating courses
        Courses course1 = new Courses("Computer Science", 301);
        Courses course2 = new Courses("Mathematics", 302);

        // Assign professors to courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Display student course information
        System.out.println("Student Course Enrollment: ");
        student1.showAllCourses();
        student2.showAllCourses();

        // Display professor course assignments
        System.out.println("Professor Course Assignments : ");
        professor1.displayCourses();
        professor2.displayCourses();

        // Display course details
        System.out.println("Course Details: ");
        course1.displayDetails();
        course2.displayDetails();
    }
}
