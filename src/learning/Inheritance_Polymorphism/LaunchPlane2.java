package learning.Inheritance_Polymorphism;

class Plane2 {
    public void takeoff() {
        System.out.println("Plane is taking off....");
    }
    public void landing(){
        System.out.println("Plane is landing....");
    }
}

class CargoPlane2 extends Plane2 {
    @Override
    public void landing() {
        System.out.println("Cargo plane requires larger runway for landing....");
    }
    public void carryGoods(){
        System.out.println("Cargo Plane Carry Goods.....");
    }
}

class Fighterplane2 extends Plane2 {
    public void landing() {
        System.out.println("Fighter Plane require shorter runway to land....");
    }
    public void carryWeapons(){
        System.out.println("Fighter Plane Carry Weapons.....");
    }
}

class Passangerplane2 extends Plane2 {
    public void takeoff() {
        System.out.println("PassengerPlane is requires medium runway to take off......");
    }
    public void landing(){
        System.out.println("Passenger plane requires medium size runway to land.....");
    }
}

class Airport
{
    public void permit(Plane2 ref){
        ref.takeoff();
        ref.landing();
    }
}

public class LaunchPlane2 {
    public static void main(String[] args) {
        CargoPlane2 cp = new CargoPlane2();
        Fighterplane2 fp = new Fighterplane2();
        Passangerplane2 pp = new Passangerplane2();

        Airport ap = new Airport();
        ap.permit(cp);
        ap.permit(fp);
        ap.permit(pp);
    }
}


