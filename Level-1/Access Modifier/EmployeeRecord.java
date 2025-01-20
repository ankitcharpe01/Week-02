class Employee{
    // instance variables
    public int employeeID;
    protected String department;
    private double salary;

    // constructor for initializing the object
    public Employee(int employeeID, String department, double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // getter for getting the value in different class
    public double getSalary(){
        return salary;
    }

    // setter for setting the value in different class
    public void setSalary(double salary){
        this.salary = salary;
    }
}

// child class for accessing protected keyword
class Manager extends Employee{
    // constructor for initializing the supe variables to child class
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // printing the variables.
    void display(){
        System.out.println("Employee Id: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("salary: " + getSalary());
    }
}

public class EmployeeRecord {
    // main class 
    public static void main(String[] args) {
        // object creation
        Manager manager = new Manager(1, "IT", 50000);
        manager.display();
    }
}
