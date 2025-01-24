package learning.Inheritance_Polymorphism;

 class Plane {
     public void takeoff() {
         System.out.println("Plane is taking off....");
     }
     public void landing(){
         System.out.println("Plane is landing....");
     }
 }

 class CargoPlane extends Plane {
     @Override
     public void landing() {
         System.out.println("Cargo plane requires larger runway for landing....");
     }
     public void carryGoods(){
         System.out.println("Cargo Plane Carry Goods.....");
     }
 }

 class Fighterplane extends Plane {
     public void landing() {
         System.out.println("Fighter Plane require shorter runway to land....");
     }
     public void carryWeapons(){
         System.out.println("Fighter Plane Carry Weapons.....");
     }
 }

public class LaunchPlane {
    public static void main(String[] args) {
        Plane cp = new CargoPlane();
        cp.takeoff();
        cp.landing();
        ((CargoPlane) cp).carryGoods();

        Fighterplane fp = new Fighterplane();
        fp.takeoff();
        fp.landing();
        fp.carryWeapons();
    }
 }
