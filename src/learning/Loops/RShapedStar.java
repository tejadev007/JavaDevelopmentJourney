package learning.Loops;

public class RShapedStar {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (j == 0 || i == 0 && j < (n - 3) || i == 1 && j == (n - 2)
                        || j == n - 1 && i >= 2 && i < ((n - 1) / 2) - 1 || i == (n - 1) / 2 && j < (n - 3)
                        || i == ((n - 1) / 2) - 1 && j == (n - 2) || i == j && i >= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
