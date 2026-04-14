package durgasirpractise.fundametalpractise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class VarargmethodPractice {

    //TODO printing both Instance&static variable in Vararg
    static int total=100;
    public static void sum(int...x){
        int total=0;
        for(int element:x){
            total=total+element;
        }
        System.out.println(total);           //as total is local variable so outside method sum value wont  print
    }

    //TODO to mix vararg parameter with other parameter vararg should mention last.
    void show(String s1,String...s2){
        System.out.println("var-arg");
    }

    //TODO atleast 1 vararg allowed
    //void show2(String...s3,int...x2){  }
        // ERROR: vararg parameter must be last

    //TODO   same var arg same 1D array can't be declared in the same class
    //void sum(int[]x){  }  // cant declare (int...x) & (int[]x) in same class

    //TODO Vararg internally present as 1D array
     void sum (int[]...x){     //internally become 2D int array
        for(int[] x1:x){
            System.out.println(Arrays.toString(x1));
        }
     }




    public static void main(String[] args) {
        sum(10,20);                   //30
        sum(10,20,30);               //60
        System.out.println(total);      //  100  as total is declared as static so It can be used in whole class level.

        VarargmethodPractice vrg=new VarargmethodPractice();
        int[] a={10,20,30};
        int[] b={40,50,60};
        //sum(a,b);                //non-static method sum(int[]...) cannot be referenced from a static context
        vrg.sum(a,b);              //[10, 20, 30]   [40, 50, 60]
    }
}
