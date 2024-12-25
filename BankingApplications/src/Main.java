
import java.util.Scanner;

abstract class bank{
    protected double balance;
    abstract void deposit(double amount);
    abstract void withdrawal(double amount);
    abstract void checkBalance();
}
class simpleBank extends bank{
    @Override
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Successfully deposited:" + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
    @Override
    void withdrawal(double amount) {
        if( amount>0 && amount<=balance){
           balance-=amount;
           System.out.println("Amount withdrawn successfully");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
    @Override
    void checkBalance() {
        System.out.println(balance);
    }
    static void welcomeScreen() {
        System.out.println("=================================");
        System.out.println("      Welcome to Simple Bank      ");
        System.out.println("      Secure, Reliable, Fast      ");
        System.out.println("=================================");
    }
}
public class Main{
    public static void main(String[] args) {
        bank obj=new simpleBank();
        simpleBank.welcomeScreen();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("----------------------------");
            System.out.println("Operations available:");
            System.out.println("  "+"1.Deposit");
            System.out.println("  "+"2.Withdraw");
            System.out.println("  "+"3.Check balance");
            System.out.println("  "+"4.Exit");
            System.out.println("----------------------------");
            System.out.print("Enter your choice:");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    obj.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:");
                    double withdrawnAmount = sc.nextDouble();
                    obj.withdrawal(withdrawnAmount);
                    break;
                case 3:
                    System.out.print("Your balance is:");
                    obj.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the banking application!");
                    break;

                default:
                    System.out.println("Please enter a valid choice.");
            }
        }while(choice!=4);
        sc.close();
    }
}