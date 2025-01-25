import java.util.ArrayList;

class GradeCalculator{
    // calculates the grade
    public static String calculateGrade(Student student){
        int total = 0;
        // iterating through the subjects and totalling marks
        for(Subject subject : student.getSubjects()){
            total += subject.marks;
        }
        // calculating average
        int average = total / student.getSubjects().size();
        String grade = "Grade is : ";
        // returns grade
        if(average >= 90){
            return grade + "A";
        }else if(average >= 80){
            return grade + "B";
        }else if(average >= 70){
            return grade + "C";
        }else if(average >= 60){
            return grade + "D";
        }else{
            return grade + "F";
        }
    }
}

class Subject{
    // attributes
    String name;
    int marks;
    // constructor
    Subject(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return marks;
    }
}


class Student{
    // static list to store subjects of a student
    private ArrayList<Subject> subjects;
    private String name;
    private int rollNumber;

    // constructor
    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new ArrayList<Subject>();
    }

    // method to get subject
    public ArrayList<Subject> getSubjects(){
        return subjects;
    }

    public void  addSubjects(Subject subject){
        subjects.add(subject);
    }

    public void showSubjects(){
        System.out.println("Student Name: " + name + " , Roll Number: " + rollNumber);
        for (Subject subject : subjects) {
            System.out.println("Subject name is: " + subject.getName() + " and Marks is " + subject.getMark());
        }

    }

}

public class SchoolResultsApplication{
    public static void main(String[] args) {
        // adding subjects to student
        Student student = new Student("Ram", 434);

        // adding subjects to list
        Subject subject1 = new Subject("Maths" , 70);
        Subject subject2 = new Subject("Chemistry" , 78);
        Subject subject3 = new Subject("Physics" , 85);

        student.addSubjects(subject1);
        student.addSubjects(subject2);
        student.addSubjects(subject3);
        student.showSubjects();
        // calculating and printing grade
        System.out.println(GradeCalculator.calculateGrade(student));
    }
}