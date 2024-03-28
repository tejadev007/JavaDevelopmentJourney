package learning.Loops;

public class diagonal_2 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i + j == n) {// Diagonal 2 formula
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
