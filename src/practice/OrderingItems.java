package practice;

import java.util.Scanner;

import java.util.ArrayList;

public class OrderingItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> orderItems = new ArrayList<>();

        while (true) {
            System.out.print("Enter the item: ");
            String item = scanner.nextLine();

            // Check if the user wants to exit (case insensitive)
            if (item.equalsIgnoreCase("exit")) {
                break;
            }

            orderItems.add(item);
        }

        scanner.close();

        // Display the order items
        System.out.println("\nOrder Items are:");
        for (String item : orderItems) {
            System.out.println(item);
        }

        // Display total number of items
        System.out.println("\nTotal number of items: " + orderItems.size());
    }
}
