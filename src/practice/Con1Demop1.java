package practice;

class Dog {
    private String name;
    private int age;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}

public class Con1Demop1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("aldo");
        d1.setAge(2);
        d1.setCost(2000);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getCost());
    }
}
