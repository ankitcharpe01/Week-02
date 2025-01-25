import java.util.ArrayList;
import java.util.List;

class Company{

    private String name ;
    private List<Department> departments;

    public Company(String name){
        this.name= name;
        this.departments= new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments(){
        System.out.println("Comapany: "+name);
        for(Department department: departments){
            System.out.println("Department: " + department.getName());
        }
    }
}

class Employee{
    private String name;
    public Employee(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Department{
    private String name;
    private List<Employee> employees;

    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees(){
        for (Employee employee: employees) {
            System.out.println("Employee: " + employee.getName());
        }
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company company1 = new Company("Capgemini Technology");

        Department dp1 = new Department("IT");
        Department dp2 = new Department("Sells");
        company1.addDepartment(dp1);
        company1.addDepartment(dp2);

        Employee emp1 = new Employee("Ram");
        Employee emp2 = new Employee("Shyam");
        Employee emp3 = new Employee("Suresh");
        Employee emp4 = new Employee("Ramesh");
        dp1.addEmployee(emp1);
        dp1.addEmployee(emp2);
        dp2.addEmployee(emp3);
        dp2.addEmployee(emp4);

        company1.displayDepartments();
        dp1.displayEmployees();
        dp2.displayEmployees();
    }
}
