package practice;

import java.util.Scanner;

public class AtheleteSpeedEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter athelete-1 speed score: ");
        double athelete1 = sc.nextDouble();

        System.out.print("Enter athelete-2 speed score: ");
        double athelete2 = sc.nextDouble();

        System.out.print("Enter athelete-3 speed score: ");
        double athelete3 = sc.nextDouble();

        double fastestOf1and2 = Math.max(athelete1, athelete2);
        double fastestOf1_2and3 = Math.max(fastestOf1and2, athelete3);

        double slowestOf1and2 = Math.min(athelete1, athelete2);
        double slowestOf1_2and3 = Math.min(slowestOf1and2, athelete3);

        System.out.println("Fastest speed: "+fastestOf1_2and3);
        System.out.println("Slowest speed: "+slowestOf1_2and3);
        
        sc.close();
    }
}
