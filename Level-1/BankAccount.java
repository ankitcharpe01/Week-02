import java.util.Scanner;

public class BankAccount {
    //Create instance variables
    private static String bankName;
    private static String accountHolderName;
    private final long accountNumber;
    private static int count =0;

    //Constructor
    public BankAccount(String bankName ,String accountHolderName, long accountNumber){
        this.bankName=bankName;
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        count++;
    }

    //Create a static method to display the total number of accounts
    public static void getTotalAccounts(){
            System.out.println("The Total Number of Bank Accounts is:- " + count);
    }

    //Create a method for display the details of bank
    public void display(){
        System.out.println("Bank Name is: "+bankName+"\nAccount Holder Name is: "+accountHolderName+"\nThe Account Number is: "+accountNumber);
    }
}

class UseBankAccount{
    //main method
    public static void main(String[] args) {
        //Take inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name: ");
        String bankName = sc.nextLine();

        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        System.out.println("Enter Account Number: ");
        long accountNumber = sc.nextLong();


        //create object of BankAccount class
        BankAccount bank = new BankAccount(bankName,accountHolderName,accountNumber);
        if(bank instanceof BankAccount){
            System.out.println("Yes ! bank is the instance of BankAccount");
            bank.display();
        }else{
            System.out.println("No! bank is not the instance of BankAccount");
        }

        System.out.println("Enter Bank Name: ");
        String bankName2 = sc.nextLine();
        System.out.println("Enter Account Holder Name: ");
        String accountHolderName2 = sc.nextLine();
        System.out.println("Enter Account Number: ");
        long accountNumber2 = sc.nextLong();

        BankAccount bank2 = new BankAccount(bankName2,accountHolderName2,accountNumber2);
        if(bank2 instanceof BankAccount){
            System.out.println("Yes ! bank2 is the instance of BankAccount");
            bank.display();
        }else{
            System.out.println("No! bank2 is not the instance of BankAccount");
        }
        BankAccount.getTotalAccounts();
    }
}
