package practice;

import java.util.Random;

public class CharityFunds {
    public static void main(String[] args) {
        Random r = new Random();

        int studentDonations = r.nextInt(901)+100;
        int staffDonations = r.nextInt(1501)+500;
        int totalDonations = studentDonations + staffDonations;

        System.out.println("Amount raised by students: $" + studentDonations);
        System.out.println("Amount raised by staff: $" + staffDonations);
        System.out.println("Amount donation collected: $" + totalDonations);
    }
}
