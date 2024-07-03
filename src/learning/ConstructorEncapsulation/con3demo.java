package learning.ConstructorEncapsulation;

class Dog2 {
    private String name;
    private int age;
    private int cost;

    public Dog2(String name, int age, int cost) {
        super(); // Super method is already there even if i dont write it here.
        this.name = name;
        this.age = age;
        this.cost = cost;
    }

    public Dog2() {
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

public class con3demo {
    public static void main(String[] args) {
        Dog2 d2 = new Dog2("sheu", 4, 14000);
        System.out.println(d2.getAge());
        System.out.println(d2.getName());
        System.out.println(d2.getCost());
    }
}
