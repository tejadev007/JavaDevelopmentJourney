package learning.OopsConcepts;

class calculator {
    int num1;
    int num2;
    int res;

    void add() {
        num1 = 10;
        num2 = 30;
        res = num1 + num2;
    }
}

public class addProgram {
    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.add();
    }
}
