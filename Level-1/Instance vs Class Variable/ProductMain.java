class Product{
    // attributes of class
    // instance variables.
    private String productName;
    private double price;

    // class variable.
    private static int totalProducts = 0;

    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // instance method.
    public void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
    // class method.
    public static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductMain{
    public static void main(String[] args) {
        // initializing and printing product 1
        Product product = new Product("Book", 10.99);
        product.displayProductDetails();
        Product.displayTotalProducts();
        System.out.println();

        // initializing and printing product 2
        Product product2 = new Product("pen", 0.99);
        product2.displayProductDetails();
        product2.displayTotalProducts();
        System.out.println();

        // initializing and printing product 1
        Product product3 = new Product("marker", 1.99);
        product3.displayProductDetails();
        product3.displayTotalProducts();
    }
}