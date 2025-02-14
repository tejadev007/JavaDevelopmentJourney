package learning.Inheritance_Polymorphism;

class Animal{
    public void eat(){
        System.out.println("Animal is eating....");
    }
    public void running() {
        System.out.println("Animal is running....");
    }
}

class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger hunts and eat..");
    }
    public void running(){
        System.out.println("Tiger runs faster than elephant....");
    }
}

class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey steals and eat....");
    }
    public void running(){
        System.out.println("Monkey jumps");
    }
}
class Deer extends Animal{
    public void eat(){
        System.out.println("Deer gazes and eat....");
    }
    public void running(){
        System.out.println("Deer runs faster.....");
    }
}

//class Forest{
//    public void permit(Animal ref){
//        ref.eat();
//        ref.running();
//    }
//}

public class LaunchAnimal {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
        t.running();

        Monkey m = new Monkey();
        m.eat();
        m.running();

        Deer d = new Deer();
        d.eat();
        d.running();


//        Forest f = new Forest();
//        f.permit(t);
//        f.permit(m);
//        f.permit(d);
    }
}

// By using this forest class, we are making the parameters in line no 39 as Animal type because
// Only parent class for all three classes can only create the objects for all the classes
