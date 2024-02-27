package learning.OopsConcepts;

class Dog{
    String name;
    int cost;

    void eat(){
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
        int i=10;
        int age=12;
        cost = 10000;
        System.out.println(age);
        System.out.println(i);
    }
    void sleep(){
        cost=20000;
        System.out.println("Sleeping");
    }
}
public class LocalInstance {
    public static void main(String[] args){
        Dog dg= new Dog();
        dg.eat();
        dg.sleep();
        dg.name = "Ram";
        System.out.println(dg.name);


    }
}
