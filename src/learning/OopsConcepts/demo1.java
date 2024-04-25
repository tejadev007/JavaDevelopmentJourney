package learning.OopsConcepts;

public class demo1 {
    void disp(){
        disp();
    }

    public static void main(String[] args) {
        demo1 d = new demo1();
        d.disp();
    }
}
// here you will create an error called stack overflow error. Refer notes to get the clarity.
