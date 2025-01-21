public class Employee {
    private static String companyName="BridgeLabz";
    private static int totalEmployee;
    private String name;
    private final int id;
    private  String designation  ;


    public Employee( String name,int id ,String designation){
        this.id = id;
        this.name = name;
        this.designation=designation;
        totalEmployee++;
    }

    public static void displayTotalEmployees(){
        System.out.println("The total number of employees is: "+totalEmployee);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee id :"+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee designation: "+designation);
    }
}
class UseEmployee{
    public static void main(String[] args) {
        Employee e1= new Employee("Sweta" , 101, "Sr. Developer" );
        Employee e2= new Employee("Niketa" , 201, "Jr. Developer" );
        System.out.println("Employee 1");
        if(e1 instanceof Employee) {
            System.out.println("Yes e1 is an instance of Employee");
            e1.displayEmployeeDetails();
        }

        System.out.println("\nEmployee 2");
        if(e2 instanceof Employee) {
            System.out.println("Yes e2 is an instance of Employee");
            e2.displayEmployeeDetails();
        }
        Employee.displayTotalEmployees();
    }
}
