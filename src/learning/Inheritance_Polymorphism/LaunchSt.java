package learning.Inheritance_Polymorphism;

class Employee{
    String name;
    int salary;
    int age;

    public Employee(){
        name="John";
        salary=50000;
        age=18;
    }
    @Override
    public String toString(){
        return "Name: "+ name+" Salary: "+salary+" Age: "+age;
    }
}

public class LaunchSt {
    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println(e1);
    }
}
