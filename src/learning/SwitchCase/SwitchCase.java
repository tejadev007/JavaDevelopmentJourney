package learning.SwitchCase;

public class SwitchCase {
    public static void main(String[] args){
        int j =20;
        switch(j){
            case 1:{
                System.out.println("Teja");
                break;
            }
            case 2:{
                System.out.println("Mani");
                break;
            }
            case 20: {
                System.out.println("Kuchipudi");
                break;
            }
            default:{
                System.out.println("No case is satisfied!!!");
            }
        }
    }
}
