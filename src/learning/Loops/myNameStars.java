package learning.Loops;

public class myNameStars {
    public static void main(String args[]) {
        int n = 11;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i == (n - 1) / 2 || i == n || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == n && j <= (n - 1) / 2 || j == 0 && i > (3 * n) / 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == n || j == 0 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
