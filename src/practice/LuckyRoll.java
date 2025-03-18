package practice;

import java.util.Random;

public class LuckyRoll {
    public static void main(String[] args) {
        Random random = new Random();
        int roll;

        // Keep rolling the dice until we get 5
        do {
            roll = random.nextInt(6) + 1; // Generates a random number between 1 and 6
            System.out.println("Rolling the dice... You got " + roll);

            if (roll != 5) {
                System.out.println("Better luck next time!\n");
            }
        } while (roll != 5); // Stop when we roll a 5

        System.out.println("Congratulations! You rolled a 5 and won!");
    }
}
