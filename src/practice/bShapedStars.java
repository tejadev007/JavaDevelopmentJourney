package practice;

public class bShapedStars {
    public static void main(String[] args) {
        int n = 20;
        for(int i =0; i<=n; i++){
            for(int j = 0; j<=n; j++){
                if(i==0 || i==n || j==0 || j==n && i<(n/2)-1 ||
                j==n && i>(n/2)+1 || i== n/2 && j<(n-1) || i ==(n/2)-1 && j==n-1
                || i==(n/2)+1 && j==(n-1)){
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
