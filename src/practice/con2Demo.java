package practice;

class Dog55 {
    private String name;
    private int age;
    private int cost;

    public Dog55() {
    	System.out.println("Zero parameterized constructor");
    }
    public Dog55(String name, int age, int cost) {
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
    	Dog55 d2 = new Dog55();
    	System.out.println(d2.getName());
    	System.out.println(d2.getAge());
    	System.out.println(d2.getCost());
    	
        Dog55 d1 = new Dog55("Snooopy", 2, 20000);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getCost());
        
        
    }
}
