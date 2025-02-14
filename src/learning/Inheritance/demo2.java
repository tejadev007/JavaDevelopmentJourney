package learning.Inheritance;

class A{
    void run(){
        System.out.println("A");
    }
}

class B {
    void run(){
        System.out.println("B");
    }
}

// If here i want extend both the classes into a new c class
// then it wont work because it will becomne multiple inheritance and create an ambiguity
// Ambiguity here is that if the demo 2 class extends the class c and if we create a object and wanna
// call run method, complier will get confused because of the same method present in both the classes
//Thus the ambiguity is created
public class demo2 {
    public static void main(String[] args) {

    }
}
