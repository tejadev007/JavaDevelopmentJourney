package learning.Inheritance_Polymorphism;

class Human{
    String name;
    int age;

    public void disp1(){
        System.out.println("Hello World");
    }
}

class Student extends Human{
public void show(){

}
}


public class Launch1 {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
