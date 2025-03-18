package practice;

public class TheaterSeating {
    public static void main(String[] args) {
        int rows = 4;  // Number of rows
        int seatsPerRow = 5;  // Number of seats in each row

        System.out.println("Theater seating arrangement:\n");

        // Nested loop for rows and seats
        for (int i = 1; i <= rows; i++) { // Loop through rows
            for (int j = 1; j <= seatsPerRow; j++) { // Loop through seats in each row
                System.out.print("Row" + i + "_Seat" + j + "\t"); // Print seat number
            }
            System.out.println(); // Move to the next line after printing one row
        }
    }
}

