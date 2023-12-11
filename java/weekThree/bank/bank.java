import java.util.Scanner;

class bank {
    private static int totalAccounts = 0;
    private static double totalBalance = 0;
    private int accountNumber;
    private double balance;

    public bank(double initialBalance) {
        this.accountNumber = ++totalAccounts;
        this.balance = initialBalance;
        totalBalance += initialBalance;
        System.out.println("\nAccount no. : " + accountNumber + " Opened with initial amount : "+ initialBalance + "\n");
    }

    void display() {
        System.out.println("\naccount no : " + accountNumber);
        System.out.println("balance of current account : " + balance + "\n");
    }

    void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("error 404 : Balance under-flow.");
        }
        else if(balance >= amount) {
            balance -= amount;
            System.out.println("Debited of amount $" + amount + " from Account no. : "+accountNumber);
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Credited of amount $" + amount + " in Account no. : "+accountNumber);
    }

    void bankDisplay() {
        System.out.println("\nTotal accounts : " + totalAccounts);
        System.out.println("Total balance of all accounts : " + totalBalance);
    }

    public static void main(String args[]) {
        System.out.println("BANK");

        bank s1 = new bank(5000);

        s1.display();
        s1.deposit(1000);
        s1.deposit(500);
        s1.withdraw(40);
        s1.withdraw(100);
        s1.deposit(50);
        
        bank s2 = new bank(5000);

        s2.deposit(1000);
        s1.deposit(500);
        s2.withdraw(40);
        s2.withdraw(100);
        s2.deposit(50);

        s1.bankDisplay();
    }
}