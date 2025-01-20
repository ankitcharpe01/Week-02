public  class Employee {
    String name;
    int id ;
    double salary;

    Employee(String name , int id , double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void showDetails(){
        System.out.println("The id of the Emplyee is: "+id);
        System.out.println("The Name of the Emplyee is: "+name);
        System.out.println("The salary of the Emplyee is: "+salary);

    }
}
class UseEmployee {
    public static void main(String[] args) {
        Employee object = new Employee("AnkitCharpe", 101, 55000.0);
        object.showDetails();
    }
}