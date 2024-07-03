package practice;

class Dog {
    private String name;
    private int age;
    private int cost;

    public Dog(String name, int age, int cost) {
        this.name = name;
        this.age = age;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCost() {
        return cost;
    }

}

public class con2Demo {
    public static void main(String[] args) {
        Dog d1 = new Dog("Snooopy", 2, 20000);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getCost());

        
    }
}
