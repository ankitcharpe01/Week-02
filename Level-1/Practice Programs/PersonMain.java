class Person{
    // attributes
    private String name;
    private int age;

    // parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // method to display result
    void displayResult(){
        System.out.println("Person detail");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30); // constructor
        Person person2 = new Person(person1); // copy constructor

        person2.displayResult(); // displaying the method
    }
}
