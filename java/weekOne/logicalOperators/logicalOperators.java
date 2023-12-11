import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean high = true;
        boolean low = false;

        System.out.println("AND operation: " + (high && low));
        System.out.println("OR operation: " + (high || low));
        System.out.println("NOT operation on high: " + (!high));
    }
}
