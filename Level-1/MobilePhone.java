public class MobilePhone {
    String brand;
    String model;
    double price;

   public MobilePhone(String brand ,String model,double price){
       this.brand=brand;
       this.model=model;
       this.price=price;
   }

   public void displayDetails(){
       System.out.println("The Brand name of te mobile phone is: "+brand);
       System.out.println("The Model name of the mobile phone is : "+model);
       System.out.println("The Price of the Mobile phone is : "+price);
   }
}
class UseMobilePhone{
    public static void main(String[] args) {
        MobilePhone object1 = new MobilePhone("Xiaomi","Redmi 13C 5G",9999.0);
        Book object2  = new Book("Samsung","Samsung Galaxy",17000.0);
        object1.displayDetails();
        object2.displayDetails();
    }
}
