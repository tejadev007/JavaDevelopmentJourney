package learning.OopsConcepts;

public class Calculator {
    int num1,num2, res;

    void add() {
        num1 = 20;
        num2 = 30;
        res = num1 + num2;
        System.out.println(res);
    }

    int diff(int a, int b) {
        num1 = a;
        num2 = b;
        res = num2 + num1;
        return res;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add();
        int c = cal.diff(20,30);
        System.out.println(c);
    }
}
