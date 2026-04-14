package durgasirpractise.oopspractise.java.Overriding;

import java.io.FileNotFoundException;

public class Parent {
    public void p1(){
        System.out.println("Inside parent method p1");
    }
    public void p2(){
        System.out.println("Inside parent method p2");
    }
    public Object p3(){
        return null;
    }
    public void p4(){
        System.out.println("Inside parent class non- abstract method");
    }
    public void p5() throws Exception{ }

    public static void p6(){
        System.out.println("p6 inside parent class static method");
    }
    public void p7(int...x){
        System.out.println("Inside parent class var-arg method ");
    }





}
