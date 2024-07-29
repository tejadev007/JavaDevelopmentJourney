package learning.ConstructorEncapsulation;

class student {
	private String name;
	private int age;
	private int marks;
	

	
	public student(String name, int age, int marks) 
	{
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	
	

}
public class con6Demo {
	public static void main(String[] args) {
		System.out.println("Main method 1");
		main(10);
	}
	public static void main(int[] args) {
		System.out.println("Main method 2");
	}
	public static void main(int a) {
		System.out.println("Main method 3");
	}
	public static void main(int a, int b) {
		System.out.println("Main method 4");
	}
}
