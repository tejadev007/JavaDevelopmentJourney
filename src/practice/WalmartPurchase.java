package practice;

import java.util.Scanner;

public class WalmartPurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        String formattedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String formattedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.print("Enter price of product 1:");
        double product1Price = sc.nextDouble();

        System.out.print("Enter price of product 2:");
        double product2Price = sc.nextDouble();

        System.out.print("Enter price of product 3:");
        double product3Price = sc.nextDouble();

        double totalPrice = product1Price + product2Price + product3Price;

        double totalPriceWithTax = totalPrice + (totalPrice* 0.12);

        String formattedTotalPrice = String.format("%.3f", totalPriceWithTax);
        System.out.println(" ");
        System.out.println("Formatted customer name: " + formattedFirstName +" "+ formattedLastName);
        System.out.println("Total cost after 12% tax: " + formattedTotalPrice);
    }
}
