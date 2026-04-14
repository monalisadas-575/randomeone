package durgasirpractise.oopspractise.java.StaticInstanceFlow;

public class StaticParent {
    static int x1=10;
    static{
        System.out.println(" First static block of Parent");
    }
    public static void s1(){
        System.out.println(" 1st static method of parent");
        s2();
    }
    public static void main(String[] args) {
        System.out.println("parent main");
        s1();

    }
    static{
        System.out.println("2nd static block of parent");
        System.out.println(x1);
    }
    public static void s2(){
        System.out.println("2nd static method of parent");
        System.out.println(j);
    }
    static int j=20;
}
