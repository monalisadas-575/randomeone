package durgasirpractise.oopspractise.java.Overriding;

import java.io.IOException;

public class Child extends Parent{
    @Override
    public void p1(){
        System.out.println("Inside method child p1");
    }
    //TODO 2 co varient return type applicable only for object type not for primitive type
    public String p3(){
        String mn;
        System.out.println("Monalisa in Child class");
        return null;
    }
//    void p4(){--- attempting weaker access privilege
//        System.out.println("Inside default method of child class");
//    }
    //TODO 4 private <default < protected <public

    //TODo 5 if Child class method throws checked exception parent class compulsory throws checked exception(its parent or same)
    public void p5() throws IOException{

    }
    //TODO 6 cant override static as non static and vice versa
    //public void p6(){}
     public static void p6(){
        //TODO 7 this is method hiding not overriding so it belongs to class. so method resolved by Compile time
         System.out.println("inside child class static method p6");
     }

     public void p7(int...x){
         System.out.println("Inside child class var-arg method");
     }



}
