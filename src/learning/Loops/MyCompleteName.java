package learning;

public class MyCompleteName {
    public static void main(String []args){
        int n = 20;
        for(int i = 0; i<= n-1; i++){
            for(int j = 0; j<=n-1; j++){
                if(j==0 || i+j==(n-1)/2 || i-j ==(n-1)/2
                || i==(n-1) && j==(n-1) || i==(n-2) && j==(n-2) || i==(n-1) && j==(n-2) || i==(n-2) && j==(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0; j<=n-1; j++){
                if(j==0 || j==n-1 || i==j && i<(n-1)/2 || i+j ==(n-1) && j>(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0; j<=n-1; j++){
                if(j==0 && i>0 || j==(n-1) && i>0 || i==0 && j>0 && j<(n-1) || i == (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0; j<=n-1; j++){
                if(j==0 || j==(n-1) || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0; j<=n-1; j++){
                if(i==0 || i==(n-1) || j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for(int j = 0; j<=n-1; j++){
                if(j==0 || i==0 && j<(n-2) || i==(n-1) && j<(n-2) || j==(n-1) && i>0 && i<(n-1)){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            System.out.println();
        }
    }
}
