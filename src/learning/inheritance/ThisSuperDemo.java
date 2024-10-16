package learning.inheritance;

class P {
    int num = 9;
}

class Q extends P {
    int num = 7;
    public void show(){
        int num = 20;
        System.out.println(super.num);
    }
}
public class ThisSuperDemo {
    public static void main(String[] args) {
        Q q = new Q();
        q.show();
    }
}
