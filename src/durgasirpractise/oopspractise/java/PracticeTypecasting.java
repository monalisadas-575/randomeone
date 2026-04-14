package durgasirpractise.oopspractise.java;

import durgasirpractise.oopspractise.java.Overriding.Child;
import durgasirpractise.oopspractise.java.Overriding.Parent;
import org.w3c.dom.ls.LSOutput;

public class PracticeTypecasting {
    String s1="Monalisa";
    Object o2=new String("Raja");
    StringBuffer sb1=new StringBuffer("Mona");
    //todo typecast String type to object type
    Object o3=(Object)s1;

    //todo run time object of p(parent) must be same with child class or derived type.otherwise clasCast exception

//    Parent p=new Parent();
//    Child c=(Child)p;  ------>ClassCastException
//todo typecast Parent type to Child type
    Parent p1=new Child();
    Child c=(Child)p1;
    Parent p100=new Parent();
    Child c100=new Child();





    public static void main(String[] args) {
        PracticeTypecasting pt1=new PracticeTypecasting();
        System.out.println(pt1.p1.getClass());
        pt1.c100.p1();//--------->overriding so called child class override method
        //(((Parent)(pt1.c100)).p1());
        //todo for upcasting pt1.c100 to parent type
        ((Parent)(pt1.c100)).p1();

    }

}
