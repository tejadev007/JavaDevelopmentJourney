package learning.ConstructorEncapsulation;

class Dog55{
	private String name;
	private int age;
	private int cost;
	
	public Dog55() {
		this("Sheru", 4, 34444);
	}
	
	public Dog55(String name, int age, int cost) {
		this("Lobo");
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	
	public Dog55(String name) {
		this.name = name;
		age = 44;
		cost = 55000;
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
public class Con5demo {
	public static void main(String[] args) {
		Dog55 d55 = new Dog55();
		System.out.println(d55.getName());
		System.out.println(d55.getAge());
		System.out.println(d55.getCost());
	}
}

