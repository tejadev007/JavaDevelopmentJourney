package learning.Inheritance;

public class demo1 {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        int result1 = obj1.add(1,2);
        CalcPro obj2 = new CalcPro();
        int result2 = obj2.add(1,2);
        int result3 = obj2.sub(3,2);
        CalcProMax obj3 = new CalcProMax();
        int result4 = obj3.add(1,2);
        int result5 = obj3.sub(3,2);
        int result6 = obj3.multi(3,2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}


