import java.util.ArrayList;
import java.util.List;

// BankAccount class
class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}

// Customer class
class Customer {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: $" + account.getBalance());
        }
    }
}

// Bank class
class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    //open account
    public void openAccount(Customer customer, BankAccount account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer customer : customers) {
            customer.viewBalance();
        }
    }
}

// Main class to demonstrate functionality
public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("Union Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        BankAccount account1 = new BankAccount(101, 5000.00);
        BankAccount account2 = new BankAccount(102, 3000.00);
        BankAccount account3 = new BankAccount(103, 7000.00);

        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        bank.showCustomers();
    }
}
