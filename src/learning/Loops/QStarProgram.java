package learning.Loops;

public class QStarProgram {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (j == (n - 1) / 4 && i > 0 && i < (3 * n) / 4 ||
                        j == (3 * n) / 4 && i > 0 && i < (3 * n) / 4 ||
                        i == 0 && j > (n - 1) / 4 && j < (3 * n) / 4 ||
                        i == (3 * n) / 4 && j > (n - 1) / 4 && j < (3 * n) / 4 ||
                        i == j && j >= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
