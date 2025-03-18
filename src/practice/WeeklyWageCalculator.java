package practice;

import java.util.Scanner;

public class WeeklyWageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalWages = 0.0;

        // Loop to take daily wage input for 7 days
        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter the daily wage for day " + day + ": $");
            double dailyWage = scanner.nextDouble();
            totalWages += dailyWage; // Adding each day's wage to total
        }

        scanner.close();

        // Display the total wages formatted to 2 decimal places
        System.out.printf("\nThe total wages for the week: $%.2f\n", totalWages);
    }
}
