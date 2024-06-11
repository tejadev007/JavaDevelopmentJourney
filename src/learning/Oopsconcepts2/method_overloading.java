package learning.Oopsconcepts2;

public class method_overloading {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int result = calc.add(1,2,3,4);
        int result_1 = calc.add(5,6);
        double result_2 = calc.add(34.5,67.67);
        System.out.println(result);
        System.out.println(result_1);
        System.out.println(result_2);
    }
}

// using the calc file in the same folder using public or default specifier
// double method can also accept the int values