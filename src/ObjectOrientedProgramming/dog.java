class dog {
    int age = 20;
    String name = "Snoopy";
    void walk(){
        System.out.println(name+" is walking.");
    }
    void asked(){
        System.out.println("Owner says "+name+"'s age is "+age);
    }

    public static void main(String []args){
        dog dg = new dog();
        System.out.println(dg.age);
        System.out.println(dg.name);
        dg.walk();
        dg.asked();

        dog dg1 = new dog();
        System.out.println(dg1.age);
        System.out.println(dg1.name);
        dg1.walk();
        dg1.asked(); 
    }
}