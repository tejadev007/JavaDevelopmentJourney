package practice;

public class diagonal1 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i<=n; i++){
            for (int j = 0; j <= n; j++){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
