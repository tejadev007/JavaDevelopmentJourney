package learning;

public class RhombusInASquare {
    public static void main(String []args){
        int n = 20;
        for(int i = 0; i <= n-1; i++){
            for(int j = 0; j <= n-1; j++){
                if(i==0 || j==0 || i==n-1 || j == n-1 || i+j == (n-1)/2 /*P1*/
                    || i-j == (n-1)/2 /*P2*/
                    || j-i == (n-1)/2 /*P3*/
                    || i+j == n+(n-1)/2 /*P4*/){ //it is not exact. but, it is approximate
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
