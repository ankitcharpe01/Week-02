import java.util.ArrayList;
import java.util.List;

class School{
    // attributes for school class
    private String name;
    private List<Student> students; // student list

    // constructor for school class
    public School(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    // getting name of school
    public String getName(){
        return name;
    }

    // adding student in school
    public void addStudent(Student student){
        students.add(student);
    }

    // getting all students in school
    public void showStudents(){
        System.out.println("Students");
        for (Student student : students){
            System.out.println(student.getName());
        }
    }

}

class Student{

    //Attributes of Student class
    private List<Course> courses;
    private String name;

    public Student(String name){
        this.name= name;
        this.courses=new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    //Adding Courses
    public void addCourse(Course course){
        courses.add(course);
    }

    //Display all courses
    public void showAllCourses(){
        System.out.println("All Courses: ");
        for(Course  course : courses){
            System.out.println(course.getName());
        }
    }
}

class Course{
    private String name;
    private List<Student> enrolledStudents;

    // constructor for course class
    public Course(String name){
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    // getting name of course
    public String getName(){
        return name;
    }

    // enrolling student in course
    public void enrollInCourse(Student student){
        enrolledStudents.add(student);
    }

    // getting all enrolled students in course
    public void getEnrolledStudents(){
        System.out.println("Enrolled students");
        for (Student student: enrolledStudents){
            System.out.println(student.getName());
        }
    }
}
public class SchoolAndStudentsWithCourses {
    public static void main(String[] args) {
        // creating a school object
        School sc = new School("School of Excellence, Chhindwara");

        // creating student object
        Student s1 = new Student("Ram");
        Student s2 = new Student("Shyam");

        // adding students to the school
        sc.addStudent(s1);
        sc.addStudent(s2);

        // creating course object
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        // adding courses to the student
        s1.addCourse(c1);
        s2.addCourse(c2);

        // adding students to the courses
        c1.enrollInCourse(s1);
        c1.enrollInCourse(s2);
        c2.enrollInCourse(s1);
        System.out.println();

        // getting all students and their courses
        System.out.println(sc.getName());
        sc.showStudents();
        System.out.println();
        s1.showAllCourses();
        System.out.println();
        s2.showAllCourses();

        System.out.println();
        c1.getEnrolledStudents();
        c2.getEnrolledStudents();
    }
}
