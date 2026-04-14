package durgasirpractise.oopspractise.java.Overloading;


public class MainPractice {
    public static void main(String[] args) {
        Test test1=new Test();   //--- Parent ref parent Object
        test1.t11();
        //TODO this is float but automatically promote to double-arg
        test1.t11(45.3f);
        //TODO as null is present in both String & Object compiler always give precedence to object type
        //TODO if null belongs to String & stringBuffer then there will be CE : refence to m1() is ambiguous
        test1.t11(null);   //Ans- String arg
        ChildTest ct100=new ChildTest();  //---- Child ref Child Object
        Test test2=new ChildTest();    //----Parent ref child Object
        System.out.println("======================================================================");
        ct100.ct1(test1);
        ct100.t11("Monalisa");
        //TODO child object can call both Parent & child method but parent object cant call child specific methods
        //test1.ct1----cant resolve



    }
}
