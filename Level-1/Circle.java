import java.net.SocketTimeoutException;

public  class Circle {

    //Create instance variable
    double radius;

    //Create constructor for initializing data
    public Circle(double radius){
        this.radius=radius;
    }

    //Create a method for compute ARea of Circle
    public double AreaOfCircle(){
       double area = Math.PI*radius*radius;
       return area;
    }

    //Create a method for compute Circumference of circle
    public double CircumferenceOfCircle(){
        double circumference = 2*Math.PI*radius;
        return circumference;
    }

    //Create a method for display all details
    public void displayDetails(double AreaOfCircle,double CircumferenceOfCircle){
        System.out.println("The Area of Circle Is : " +AreaOfCircle);
        System.out.println("The Circumference of Circle Is : " +CircumferenceOfCircle);
    }
}

class UseCircle{
    //main class
    public static void main(String[] args) {
        //Create object of class Circle and pass the radius
        Circle object = new Circle(6.0);
        //Called Display Details Method
        object.displayDetails(object.AreaOfCircle(),object.CircumferenceOfCircle());
    }
}