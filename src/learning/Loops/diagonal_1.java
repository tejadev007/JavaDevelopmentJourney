package learning.Loops;

public class diagonal_1 {
    public static void main(String[] arg) {
        int n = 20;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j) {// Diagonal 1
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
