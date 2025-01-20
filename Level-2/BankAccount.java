import java.util.Scanner;

public class BankAccount {
    String accountHolder ;
    long acountNumber;
    double balance;

    public BankAccount(String accountHolder,long accountNumber , double balance){
        this.accountHolder=accountHolder;
        this.acountNumber=accountNumber;
        this.balance= balance;
    }

    public double depositingMoney(double depositted){
        balance=balance+depositted;
        return balance;
    }
    public double withdrawMoney(double withdrawing){
        if(balance>withdrawing) {
            balance = balance - withdrawing;
        }else{
            System.out.println("Insufficient Balance!!");
        }
        return balance;
    }
    public void displayCurrentBalance(){
        System.out.println("Your Current Balance is : "+balance);
    }
}

class UseBankAccount{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account Holder Name : ");
    String accountHolder=sc.next();
    System.out.println("Enter your account Number : ");
    long accountNumber=sc.nextLong();
    System.out.println("Enter Balance : ");
    double balance = sc.nextDouble();

    BankAccount object = new BankAccount(accountHolder,accountNumber,balance);
    System.out.println("Enter Depositing Money in RS");
    double depositingMoney = sc.nextDouble();

    double deposite =object.depositingMoney(depositingMoney);
    System.out.println("You have been Deposited: "+depositingMoney+" and your current balance is : "+deposite);

    System.out.println("Enter Withdrawing Money in RS ");
    double withdrwingMoney = sc.nextDouble();

    double withdraw= object.withdrawMoney(withdrwingMoney);
    System.out.println("You have been Withdrawing "+withdrwingMoney+"and your current balance is : "+withdraw);
    object.displayCurrentBalance();
  }
}