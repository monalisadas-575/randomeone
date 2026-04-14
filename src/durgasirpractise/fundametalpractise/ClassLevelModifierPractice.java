package durgasirpractise.fundametalpractise;
import durgasirpractise.fundametalpractise.DeclarationPractice;

public class ClassLevelModifierPractice {

    public static void main(String[] args) {
        ClassLevelModifierPractice clm=new ClassLevelModifierPractice();
        //
        DeclarationPractice dp=new DeclarationPractice();
        dp.print();

    }
}
final class Parent{//TODO if class prent will final then child class cant inherit the class
    static int x=90;
    static final public void property(){
        System.out.println("Cash");
    }
    public void marry(){
        System.out.println("Subhalaxmi");
    }
//TODO all methods inside final class is always final bydefault but variable are not final.
    public static void main(String[] args) {
        Parent p1=new Parent();
       property();
       p1.marry();
       int x=1000;
        System.out.println(x);   //1000
      //TODO changed the static value of x to 1000 in object p1 & p2 asits not final
        Parent p2=new Parent();
        System.out.println(x);
    }
} /*class child extends Parent{
    //TODO static final method cant overriden in the child class
    public void marry(){
        System.out.println("Lolita");
    }
    }*/

abstract strictfp class vehicle{  //TODO Abstract strictfp combination can be used for classes but not for methods
    abstract int noOfWheel();  //TODO abstract method cant have body
    final String WheelColor(){return "black";} //TODO Abstract class can contain final method,where as final class can't contain abstract method

    abstract public String vehicleCondition();
// TODo final,native,synchronized,static,private,strictFP modifiers are not allowed for methods w.r.t abstract
}
class Bus extends vehicle{
   public int noOfWheel(){
       return 7;
    }
    public String vehicleCondition(){
        return "Good";

    }
}



