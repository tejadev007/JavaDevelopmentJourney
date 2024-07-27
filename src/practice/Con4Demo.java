package practice;

class Dog56{
	private String name;
	private int age;
	private int cost;
	
	public Dog56() {
		this("lobo");
	}
	
	public Dog56(String name, int age, int cost) {
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	
	public Dog56(String name) {
		this("Sheru", 5, 54000);
		this.name = name;
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

public class Con4Demo {
	public static void main(String[] args) {
		Dog56 d56 = new Dog56();
		System.out.println(d56.getName());
		System.out.println(d56.getAge());
		System.out.println(d56.getCost());
	}
}
