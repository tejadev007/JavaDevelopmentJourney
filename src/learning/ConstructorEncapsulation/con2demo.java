package learning.ConstructorEncapsulation;

class Dog1 {
    private String name;
    private int age;
    private int cost;

    public Dog1(String name, int age, int cost) {
        super(); // Super method is already there even if i don't write it here. 
        this.name = name;
        this.age = age;
        this.cost = cost;
    }

    public Dog1() {
        super();
        System.out.println("Zero parameterized constructor");
    }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    // this.name = name;
    // }

    public int getAge() {
        return age;
    }

    // public void setAge(int age) {
    // this.age = age;
    // }

    public int getCost() {
        return cost;
    }

    // public void setCost(int cost) {
    // this.cost = cost;
    // }
}

public class con2demo {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        System.out.println(d1.getCost());
        System.out.println(d1.getName());
        System.out.println(d1.getAge());

        Dog1 d2 = new Dog1("teJa", 2, 2000);
        System.out.println(d2.getCost());
        System.out.println(d2.getName());
        System.out.println(d2.getAge());
    }
}
