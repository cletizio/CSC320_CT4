import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int i = 0;
        double total = 0;
        double average = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        while (i < 5) {
            double userNum = 0;
            System.out.print("Enter a value " + (i + 1) + ": ");
            userNum = scnr.nextDouble();
            total += userNum;
            ++i;

            if (userNum > max) {
                max = userNum;
            }

            if (userNum < min) {
                min = userNum;
            }
        }
        // Calculate average
        average = total / i;

        // Calculate interest
        double interest = total * 0.20;

        // Print information
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest: " + interest);
    }
}
