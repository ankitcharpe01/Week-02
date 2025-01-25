
import java.util.ArrayList;
import java.util.List;


class Customer{
    //customer class shows the composition with order
    //attributes
    private String name;
    private List<Order> orders;

    //initialization
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // getting name of customer
    public String getName(){
        return name;
    }

    // adding orders to customer
    public void addOrders(Order order) {
        orders.add(order);
    }
    // show all orders placed  by customer
    public void showOrders(){
        System.out.println("Orders");
        for (Order order: orders){
            System.out.println("- " + order.getName());
        }
    }
}
class Order{
    // attributes
    //order class shows aggregation with products
    private String name;
    private List<Product> products;

    // constructor for order
    public Order(String name){
        this.name = name;
        this.products = new ArrayList<>();
    }

    // getting name of order
    public String getName(){
        return name;
    }

    // adding products to order
    public void addOrder(Product product){
        products.add(product);
    }

    // show all products in order
    public void allProducts(){
        System.out.println("Products");
        for (Product product: products){
            System.out.println("- " + product.getName());
        }
    }
}
class Product{
    // attributes  - name of product
    private String name;

    // constructor for product
    public Product(String name){
        this.name = name;
    }

    // getting name of product
    public String getName(){
        return name;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        // creating objects and adding products and orders to customer
        Customer c1 = new Customer("Ram");

        // all products
        Product p1 = new Product("Apple juice");
        Product p2 = new Product("Orange juice");

        // all orders
        Order o1 = new Order("order1");

        // adding products to orders
        o1.addOrder(p1);
        o1.addOrder(p2);

        // adding orders to customer
        c1.addOrders(o1);

        // show all orders made by customer
        c1.showOrders();
        System.out.println();

        // show all products in order
        o1.allProducts();
    }
}