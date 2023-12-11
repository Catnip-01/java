import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (operator) {
            case '+':
                System.out.println("Sum is: " + (a + b));
                break;
            case '-':
                System.out.println("Difference is: " + (a - b));
                break;
            case '*':
                System.out.println("Product is: " + (a * b));
                break;
            case '/':
                System.out.println("Quotient is: " + (a / b));
                break;
            case '%':
                System.out.println("Remainder is: " + (a % b));
                break;
            default:
                System.out.println("Enter operator properly");
                break;
        }
    }
}
