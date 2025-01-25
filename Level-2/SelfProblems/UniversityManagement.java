import java.util.ArrayList;
import java.util.List;

//Faculty class
class Faculty {
    //attributes
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//Department class
class Department {
    //attribute
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//university class
class University {
    //Attribute of university with faculties and departments
    private String name;
    private List<Department> departments;
    private List<Faculty> facultyMembers;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }
    //a department cannot exist without a university, this represents composition
    public void addDepartment(Department department) {
        departments.add(department);
    }
    //Faculty members can exist independently, demonstrating aggregation
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showDetails() {
        System.out.println("University Name: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println( d.getName());
        }
        System.out.println("Faculty Members:");
        for (Faculty f : facultyMembers) {
            System.out.println( f.getName());
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {

        //Creating object of faculty class
        Faculty faculty1 = new Faculty("Tokiyo");
        Faculty faculty2 = new Faculty("Berlin");

        //Creating object of department class
        Department dept1 = new Department("CSE");
        Department dept2 = new Department("IT");

        University university = new University("Technocrats University");
        university.addDepartment(dept1);
        university.addDepartment(dept2);
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        university.showDetails();
        System.out.println("Faculty members are: " + faculty1.getName() + " , " + faculty2.getName());
    }
}
