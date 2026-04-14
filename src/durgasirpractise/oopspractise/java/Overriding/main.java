package durgasirpractise.oopspractise.java.Overriding;

public class main {
    public static void main(String[] args) {
        //TODO 1 takes care by JVM based on runtime object
        Parent p10=new Child();     //-----parent ref child object
        p10.p1();       // It calls child class methods

        //TODO 2 In overriding child class method need not be same with Parent. It can be co-varient type.
        p10.p3();
        p10.p4();
        //TODO 3 We can override non-abstract method as abstract method and vice versa.
        // Parent p11=new AbstractChild();//----Cant create object of Abstract class
        System.out.println("============================================");

        //TODO 4 while overriding we cant reduce it' access like public to private
        //TODO 7 method hiding
        p10.p6();
        p10.p7(7);//--inside child class because (child object parent ref) in overriding


    }
}
