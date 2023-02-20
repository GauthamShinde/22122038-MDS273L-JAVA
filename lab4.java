import java.util.ArrayList;
import java.util.Scanner;

public class lab4 {
    int AccNo;
    String AccHolderName;
    double balance;

    ArrayList<String> transactionHistory = new ArrayList<String>();

    public lab4(int AccNo, String AccHolderName, double balance) {
        this.AccNo = AccNo;
        this.AccHolderName = AccHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
            System.out.println("Amount deposited successfully");
            System.out.println("Current balance: "+balance);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount);
            System.out.println("Amount withdrawn successfully.");
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount. Please try again.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public void printAccountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Account Number: " + AccNo);
        System.out.println("Account Holder Name: " + AccHolderName);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int AccNo = sc.nextInt();

        System.out.print("Enter account holder name: ");
        String AccHolderName = sc.next();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        lab4 account = new lab4(AccNo, AccHolderName, balance);

        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transaction history");
            System.out.println("4. Print account summary");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.printTransactionHistory();
                    break;
                case 4:
                    account.printAccountSummary();
                    break;
                case 5:
                    System.out.println("Thank you for using our banking system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}