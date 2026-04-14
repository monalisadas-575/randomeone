package durgasirpractise.fundametalpractise.util2;


import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Method;

public class Util2Practice {
    Object o=new String("Durga");
    Class c=o.getClass();
    Method[] m=c.getDeclaredMethods();




    public static void main(String[] args) {
       Util2Practice up1=new Util2Practice();
        int count=0;
        for(Method m1:up1.m){
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("The no of methods :"+count);
    }
}
