package learning;

public class diagonals_1_and_2 {
    public static void main(String args[]){
        int n = 20;
        for(int i = 0; i <= n-1; i++){
            for(int j = 0; j <= n-1; j++){
                if (i==j || i+j == n-1 || i==0 || j==0 || i==n-1 || j==n-1){//Diagonal 1 and 2 formula and (|| i==0 || j==0 || i==n-1 || j==n-1) this one is to make it a square.
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
