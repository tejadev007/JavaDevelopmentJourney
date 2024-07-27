package learning.ConstructorEncapsulation;

class Dog44{
	private String name;
	private int age;
	private int cost;
	
	public Dog44() {
		this("lobo");
	}
	
	public Dog44(String name, int age, int cost) {
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	
	public Dog44(String name) {
		this("sheeru", 4, 14450);
		this.name = name;
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
public class Con4Demo {
	public static void main(String[] args) {
		Dog44 d44 = new Dog44();
		System.out.println(d44.getName());
		System.out.println(d44.getAge());
		System.out.println(d44.getCost());
	}
}
