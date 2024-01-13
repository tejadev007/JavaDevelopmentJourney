public class bShapeStars {
    public static void main(String args[]){
        int n=20;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                if(i==0 || j==0 || i==n || j==n && i<n/4 
                || j==n && i>(3*n)/4 || 
                i==(n/2) && j<(n/2) || i==5 && j==(n-1)
                || i==6 && j==(n-2) || i==7 && j==(n-3) ||
                i==8 && j==(n-4) || i==9 && j==(n-5)
                || i==10 && j<(n-6) || i==11 && j==(n-5) ||
                i==12 && j==(n-4) || i==13 && j==(n-3) ||
                i==14 && j==(n-2) || i==15 && j==(n-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            }
            
            for(int j=0; j<=n; j++){
                if(j==0 || j== (n)/2 && i!=0 && i!= (n)/2 && i!=(n) || i==(n)/2 && j<(n)/2 || i==(n) && j<(n)/2){
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