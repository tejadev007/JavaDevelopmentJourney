package ConstructorEncapsulation;

class Dog {
    private String name;
    private int age;
    private int cost;

    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
    public int getAge() {
        return age;
    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
    public int getCost() {
        return cost;
    }
//
//    public void setCost(int cost) {
//        this.cost = cost;
//    }

    Dog(String name, int age, int cost){ // By using this I can remove the setters. But, getters cannot be removed
        this.name = name;
        this.age = age;
        this.cost = cost;
    }
}
public class con1demo {
    public static void main(String[] args) {
        Dog d1 = new Dog("TeJa", 26, 500);
//        d1.setAge(20);
//        d1.setCost(2000);
//        d1.setName("Rose");
        System.out.println(d1.getAge());
        System.out.println(d1.getCost());
        System.out.println(d1.getName());

    }
}
