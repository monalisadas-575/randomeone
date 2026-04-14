package durgasirpractise.fundametalpractise;
import java.util.ArrayList;
import java.util.*;
import java.sql.Date;
import static java.lang.Math.sqrt;
import static java.lang.Integer.*;
import static java.lang.Byte.*;
import static java.lang.Integer.MAX_VALUE;





public class DeclarationPractice {
    public void print(){
        System.out.println("i am inside declarationPractice");
    }
    public static void main(String[] args) {
        //TODO can use fully qualified name instaed of import but Not Recommended
        //java.util.ArrayList l=new java.util.ArrayList<>();
        ArrayList l=new ArrayList();
        l.add("Monalisa");
        l.add(1998);
        l.add("saumrit");
        l.add(1995);
        System.out.println(l);

//TODO Reference to 'Date' is ambiguous, both 'java.sql.Date' and 'java.util.Date' match
      //Date d2=new Date(); //Cannot resolve constructor 'Date()
       Date d1=new Date(System.currentTimeMillis());// Import directly java.sql.date explicitly
        System.out.println(d1);
        //TODO Reference to 'MAX_VALUE' is ambiguous, both 'Byte.MAX_VALUE' and 'Integer.MAX_VALUE' match
        //System.out.println(MAX_VALUE);

        //TODO with static import explicitly sqrt
        //no need to write (Math.sqrt(23));
        System.out.println(sqrt(23));




    }
}/*
 class Test{
    static String s="java";
    void test(){
        System.out.println(MAX_VALUE);
    }

    //TODO to print MAX_VALUE 1at priority is CWD 2nd Explicit MAX_VALUE then Implicit MAX_value
static int MAX_VALUE=999;
     public static void main(String[] args) {
         //System.out.println(Test.s.length());
         System.out.println(MAX_VALUE);
     }

 } //class 'Test' is public, should be declared in a file named Test.java

//TODO fullyqualified name without using import
class multiple1 extends durgasirpractise.fundametalpractise.OperatorPractice{
    public void printX(){
        System.out.println("this X is inside OperatorPractce-"+this.x);
    }
    public static void main(String[] args) {

        multiple1 mp1=new multiple1();
        mp1.printX();

    }
}
*/


