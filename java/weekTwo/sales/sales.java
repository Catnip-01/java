import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();

        double[] sales = new double[numSalespeople];
        double totalSales = 0, maxSale = Double.MIN_VALUE, minSale = Double.MAX_VALUE;
        int maxSaleId = -1, minSaleId = -1;

        for (int i = 0; i < numSalespeople; i++) {
            int id = i + 1;
            System.out.print("Enter sales for Salesperson " + id + ": ");
            sales[i] = scanner.nextDouble();

            if (sales[i] > maxSale) { maxSale = sales[i]; maxSaleId = id; }
            if (sales[i] < minSale) { minSale = sales[i]; minSaleId = id; }

            totalSales += sales[i];
        }

        System.out.println("\nSales Report:");
        for (int i = 0; i < numSalespeople; i++) {
            int id = i + 1;
            System.out.println("Salesperson " + id + ": $" + sales[i]);
        }

        double averageSale = totalSales / numSalespeople;
        System.out.println("Total Sales: $" + totalSales + "\nAverage Sale: $" + averageSale);
        System.out.println("Highest Sale: Salesperson " + maxSaleId + " ($" + maxSale + ")");
        System.out.println("Lowest Sale: Salesperson " + minSaleId + " ($" + minSale + ")");

        System.out.print("\nEnter a value to check sales exceeding: $");
        double threshold = scanner.nextDouble();

        int salespeopleExceededCount = 0;
        System.out.println("\nSalespeople exceeding $" + threshold + ":");
        for (int i = 0; i < numSalespeople; i++) {
            int id = i + 1;
            if (sales[i] > threshold) {
                System.out.println("Salesperson " + id + ": $" + sales[i]);
                salespeopleExceededCount++;
            }
        }

        System.out.println("Total salespeople exceeding $" + threshold + ": " + salespeopleExceededCount);
    }
}
