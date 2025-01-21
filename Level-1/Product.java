public class Product {
    // Static variable shared across all products
    private static double discount = 0.0;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

        //initializing instance variables
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount for all products
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("Discount updated to: " + discount + "%");
        } else {
            System.out.println("Invalid discount value. Please enter a value between 0 and 100.");
        }
    }

    // Method to calculate the final price after discount
    public double getFinalPrice() {
        double discountedPrice = price - (price * discount / 100);
        return discountedPrice * quantity;
    }
    // Display product details
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("\nProduct ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price per unit: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price after discount: " + getFinalPrice());
        } else {
            System.out.println("Invalid product object.");
        }
    }
}

// Driver class
class ShoppingCart {
    public static void main(String[] args) {
        // Creating product instances
        Product p1 = new Product("Laptop", 1000, 2, 101);
        Product p2 = new Product("Smartphone", 500, 3, 102);

        System.out.println("Product 1");
        if (p1 instanceof Product) {
            System.out.println("Yes, p1 is an instance of Product.");
            p1.displayProductDetails();
        }

        System.out.println("\nProduct 2");
        if (p2 instanceof Product) {
            System.out.println("Yes, p2 is an instance of Product.");
            p2.displayProductDetails();
        }

        // Updating discount for all products
        Product.updateDiscount(10);
        System.out.println("\nAfter Applying Discount:");

        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
