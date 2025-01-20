class BankAccount{
    // declaring instance variables
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // constructor for initializing object
    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // getters for private variable to get value in it
    public double getBalance(){

        return balance;
    }
    // setters for private variable to set value in it
    public void setBalance(double balance){

        this.balance = balance;
    }
}

// child class for accessing protected variables
class SavingsAccount extends BankAccount{
    // constructor for child class
    public SavingsAccount(int accountNumber, String accountHolder, double balance){
        // accessing values from parent class
        super(accountNumber, accountHolder, balance);
    }

    // printing all variables
    void display(){
        System.out.println("Account nummber: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountManagement{
    public static void main(String[] args) {
        // creates object
        SavingsAccount obj = new SavingsAccount(122367657, "Radheshyam", 5000000);
        obj.display();
    }
}