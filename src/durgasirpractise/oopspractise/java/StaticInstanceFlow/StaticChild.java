package durgasirpractise.oopspractise.java.StaticInstanceFlow;

public class StaticChild extends StaticParent {
    static int x2=100;
    static{
        System.out.println(" First static block of child");
    }
    public static void c1(){
        System.out.println(" 1st static method of child");
        c2();
    }
    public static void main(String[] args) {
        System.out.println("child main");
        c1();

    }
    static{
        System.out.println("2nd static block of child");
        System.out.println(x2);
    }
    public static void c2(){
        System.out.println("2nd static method of parent");
        System.out.println(y2);
    }
    static int y2=200;
}
