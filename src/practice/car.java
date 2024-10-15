package practice;

public class car {
	String color;
	String model;
	
	void drive() {
		System.out.println("Car is being driven");
	}
	
	public static void main() {
		car myCar = new car();
		myCar.color = "red";
		myCar.model = "Tesla X";
		myCar.drive();
	}
}


