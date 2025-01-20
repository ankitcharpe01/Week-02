//class Student
class Student{
    //private members name, rollNumber, marks
    private String name;
    private int rollNumber;
    private int marks;

    //Constructor
    public Student(String name, int rollNumber, int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    //method to calculate grade
    public String calculateGrade(){
        if(marks>=400)
            return "A";
        else if (marks>=300&&marks<400)
            return "B";
        else if(marks>=200&&marks<300)
            return "C";
        else if(marks>=100&&marks<200)
            return "D";
        else
            return "R";
    }
    //method to dispaly details and grade
    public void displayDetails(){
        System.out.println("Student :\t\t "+name);
        System.out.println("Roll number :\t "+rollNumber);
        System.out.println("Marks :\t\t\t "+marks);
        System.out.println("Grade :\t\t\t "+calculateGrade());

    }
}
//Main class
class MainStudent {
    public static void main(String[] args) {
        //object creation
        Student student1=new Student("XYZ",1,400);
        Student student2=new Student("ABC",2,350);
        Student student3=new Student("PQR",3,200);
        //displaying details
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}