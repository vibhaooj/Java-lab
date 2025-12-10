
import java.util.Scanner;


class Account {
    protected String customerName;
    protected int accountNumber;
    protected String accountType;
    protected double balance;

    public Account(String name, int accNo, String type, double initialBalance) {
        customerName = name;
        accountNumber = accNo;
        accountType = type;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}


class SavAcct extends Account {
    private double interestRate = 0.05; 

    public SavAcct(String name, int accNo, double initialBalance) {
        super(name, accNo, "Savings", initialBalance);
    }

    public void computeInterest(int years) {
        double interest = balance * Math.pow((1 + interestRate), years) - balance;
        balance += interest;
        System.out.println("Interest of ₹" + interest + " added for " + years + " years.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}


class CurAcct extends Account {
    private double minimumBalance = 1000.0;
    private double serviceCharge = 100.0;

    public CurAcct(String name, int accNo, double initialBalance) {
        super(name, accNo, "Current", initialBalance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    private void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Balance below minimum. Service charge of ₹" + serviceCharge + " imposed.");
        }
    }

    public void issueChequeBook() {
        System.out.println("Cheque book facility is available.");
    }
}


public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample usage
        SavAcct savings = new SavAcct("Shalini", 101, 5000);
        CurAcct current = new CurAcct("Rahul", 102, 1500);

        System.out.println("\n--- Savings Account ---");
        savings.deposit(2000);
        savings.computeInterest(2);
        savings.withdraw(1000);
        savings.displayBalance();

        System.out.println("\n--- Current Account ---");
        current.deposit(1000);
        current.withdraw(2500); 
        current.issueChequeBook();
        current.displayBalance();

        sc.close();
    }
}
