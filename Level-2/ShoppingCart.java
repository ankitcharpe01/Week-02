import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

public class ShoppingCart {
    static CartItem[] cart = new CartItem[10]; // Array to hold up to 10 items
    static int itemCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                case 3:
                    displayTotalCost();
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Method to add an item to the cart
    public static void addItem(Scanner scanner) {
        if (itemCount >= cart.length) {
            System.out.println("Cart is full. Cannot add more items.");
            return;
        }

        System.out.print("Enter item name: ");
        scanner.nextLine(); // Consume newline
        String itemName = scanner.nextLine();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();

        cart[itemCount++] = new CartItem(itemName, price, quantity);
        System.out.println("Item added to the cart successfully.");
    }

    // Method to remove an item from the cart
    public static void removeItem(Scanner scanner) {
        if (itemCount == 0) {
            System.out.println("Cart is empty. No items to remove.");
            return;
        }

        System.out.print("Enter the item number to remove (1 to " + itemCount + "): ");
        int itemNumber = scanner.nextInt();

        if (itemNumber < 1 || itemNumber > itemCount) {
            System.out.println("Invalid item number. Please try again.");
            return;
        }

        for (int i = itemNumber - 1; i < itemCount - 1; i++) {
            cart[i] = cart[i + 1]; // Shift items to the left
        }
        cart[--itemCount] = null; // Clear the last item
        System.out.println("Item removed from the cart successfully.");
    }

    // Method to display the total cost
    public static void displayTotalCost() {
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
            return;
        }

        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cart[i].price * cart[i].quantity;
        }

        System.out.println("Total cost of items in the cart: $" + totalCost);
    }
}
