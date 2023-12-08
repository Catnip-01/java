import java.util.Scanner;

class Account{
    private static int total_accounts = 0;
    private static double total_bal = 0;
    private int acc_no;
    private double balance;

    void input(double initial_bal) {
        acc_no = ++total_accounts;
        balance = initial_bal;
        total_bal += initial_bal;
    }

    void print() {
        System.out.println("Acc no: "+ acc_no);
        System.out.println("balance: " + balance);
        System.out.println("Total Balance: " + total_bal);
    }

    void deposit(double amt) {
        balance += amt;
        total_bal += amt;
    }
    void withdraw(double amt) {
        balance -= amt;
        total_bal -= amt;
    }
};

public class account {

    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        Account s1 = new Account();
        Account s2 = new Account();
        Account s3 = new Account();
        s1.input(654);
        s2.input(7534);
        s3.input(346);

        s1.print();
        s2.print();
        s3.print();

        s1.withdraw(14);
        s2.deposit(65);

        s1.print();
        s2.print();


    }
}