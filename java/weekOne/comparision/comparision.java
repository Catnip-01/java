import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("Equality: " + (a == b));
        System.out.println("Inequality: " + (a != b));
        System.out.println("Smaller: " + (a < b));
        System.out.println("Larger: " + (a > b));
        System.out.println("Smaller or equal to: " + (a <= b));
        System.out.println("Larger or equal to: " + (a >= b));
    }
}
