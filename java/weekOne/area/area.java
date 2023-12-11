import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = scanner.nextInt();

        double area = radius * radius * 3.14;
        System.out.println("Area is: " + area);
    }
}
