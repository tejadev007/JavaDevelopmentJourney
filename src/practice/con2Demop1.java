package practice;

class Dog66 {
	private String name;
	private int age;
	private int cost;
	
	public Dog66() {
		System.out.println("Zero parameterized constructor");
	}
	
	public Dog66(String name, int age, int cost) {
		this.name = name;
		this.age = age;
		this.cost = cost;
		System.out.println("parameterized constructor");
	}
	
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getAge() {
		return age;
	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public int getCost() {
		return cost;
	}
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
	
	
}

public class con2Demop1 {
    public static void main(String[] args) {
        Dog66 d1 = new Dog66();
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getCost());
        
        Dog66 d2 = new Dog66("Snoopy", 16, 2000);
        System.out.println(d2.getName());
        System.out.println(d2.getAge());
        System.out.println(d2.getCost());
    }
}
