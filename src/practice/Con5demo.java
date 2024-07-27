package practice;

class Dog567{
	private String name;
	private int age;
	private int cost;
	
	public Dog567() {
		this("Sheru", 5, 54000);
	}
	
	public Dog567(String name, int age, int cost) {
		this("lobo");
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	
	public Dog567(String name) {
		this.name = name;
		age = 56;
		cost = 78787;
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

public class Con5demo {
	public static void main(String[] args) {
		Dog567 d567 = new Dog567();
		System.out.println(d567.getName());
		System.out.println(d567.getAge());
		System.out.println(d567.getCost());
	}
}
