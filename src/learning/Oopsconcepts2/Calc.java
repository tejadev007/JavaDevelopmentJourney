package learning.Oopsconcepts2;

public class Calc {
    public int add(int num1, int num2, int num3, int num4){
        int result= num1 + num2 + num3 + num4;
        return result;
    }

    public int add(int num1, int num2){
        int result = num1 = num2;
        return result;
    }

    public double add(double num1, double num2){
        double result = num1 + num2;
        return result;
    }

}

// This concept is called method overloading
// using the same method name but changing the parameter count or type of parameters