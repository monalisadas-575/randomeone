package durgasirpractise.JavalangPractice.ObjectMethodPractice;

public class AutoboxingWideningPractice {
    public static void m1(Integer I){
        System.out.println("Auto Boxing");
    }
//    public static void m1(long l){
//        System.out.println("widening");
//    }
    public static void m1(int...x){
        System.out.println("Var-arg");
    }
    //todo as Integer & Long don't have any relation after autoboxing to Integer from int, it can't be applied to Integer
    public static void m2(Long l){
        System.out.println("Long");
    }
    public static void m3(long l){
        System.out.println("long");
    }


    public static void main(String[] args) {
        //todo As widening old concept so 1st priority will be widening
        //todo after comment out widening, priority will be Autoboxing least is var..arg
        int x=10;
        m1(x);
        //m2(x);-- Long can't be applied to int.
        //todo int can be upgraded to long its widening concept
        m3(10);  //long
        //todo r stores null still it returns false always in object class .equals compares address.
        Object r=new Object();
        System.out.println(r==null);
        System.out.println(r.equals(null));
    }
}
