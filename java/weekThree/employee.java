import java.util.Scanner;

class Employee {
    private String name;
    private String dept;
    private static int total_account = 0;
    private static double total_salery = 0;
    private double salery = 0;

    void input(String n, String d, double s) {
        name = n;
        dept = d;
        total_account++;
        total_salery += s;
        salery = s;
    }

    void print() {
        System.out.println("\nName is: " + name);
        System.out.println("Dept name is: " + dept);
        System.out.println("Salery is : " + salery);
        System.out.println("\nCompany details: ");
        System.out.println("    Total expense is: " + total_salery);
        System.out.println("    Number of account: " + total_account);
    }
}
class employee{
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.input("John", "SDE", 234563);
        e2.input("Joe", "Data Analyst", 16833);

        e1.print();
        e2.print();
    }
}