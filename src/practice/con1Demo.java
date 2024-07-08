package practice;

class Dog44 {
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
public class con1Demo {
    public static void main(String[] args) {
        Dog44 d1 = new Dog44();
        d1.setName("TeJa");
        d1.setAge(20);
        d1.setCost(12000);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getCost());
    }
}
