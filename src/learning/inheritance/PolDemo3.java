package learning.inheritance;

class Phone{
    public void callingFromAPhoneToDiscussSomethingImportant(){
        System.out.println("calling");
    }

//    public void call(){
//        System.out.println("call");
//    }
}
class Iphone extends Phone{
    @Override
    public void callingFromAPhoneToDiscussSomethingImportant(){
        System.out.println("calling from an Iphone");
    }
}

class PixelPhone extends Phone{
    public void call(){
        System.out.println("calling from pixel");
    }
}

public class PolDemo3 {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.callingFromAPhoneToDiscussSomethingImportant();

        Phone obj2 = new Iphone();
        obj2.callingFromAPhoneToDiscussSomethingImportant();

        PixelPhone obj3 = new PixelPhone();
        obj3.call();
    }
}
