package durgasirpractise.BeforeStringPractice;

class TypeCast1{
    public static void main(String[] args) {
        Object O1=new StringBuffer("Durga");
        StringBuffer sb1=(StringBuffer)O1;
        System.out.println(O1.getClass().getName());
    }
}

//
class Type1{
    int x=50;
    public void m1(){
        System.out.println("A");
    }
}
class Type2 extends Type1{
    int x=60;
    public void m1(){
        System.out.println("B");
    }
}
class Type3 extends Type2{
    int x=70;
    public void m1(){
        System.out.println("C");
    }
}
class Ex1{
    public static void main(String[] args) {
        Type3 c11=new Type3();
        c11.m1();
        ((Type2)c11).m1();//Type3-->tyoe2  upcasting
        ((Type1)((Type2)c11)).m1();//Type2-->tyoe1  upcasting
        System.out.println((c11).x);
        System.out.println(((Type2)c11).x);
        Type1 t=(Type1)((Type2)c11);
        System.out.println(((Type1)((Type2)c11)).x);

    }
}


//Static control flow

class Static12{
    static int i=10;
    static{
         st();//---->Indirect read
        System.out.println(i);//------------------------------------->Direct read
        System.out.println("First Static block");
    }
    public static void main(String[] args) {
        st();//----------------------------------------------------->Indirect read
        System.out.println("main method");
    }
    public static void st(){
        System.out.println(j);
    }
    static{
        System.out.println("second static block");
    }
    static int j=20;
}


//Some Random example-1
class Random1{
    static int x1=m1();
   public static int m1(){
       System.out.println("The int value outside main is:"+x1);
       return 100;
   }
    public static void main(String[] args) {
       m1();
        System.out.println("The int value inside main is:"+x1);
    }
}


//Sattic Control flow in parent to child Relationship

class Base0{
    static int i=10;
    static{
        m1();
        System.out.println("Base Static block");
    }
    public static void main(String[] args) {
        m1();
        System.out.println("Base main method");
    }
    public static void m1(){
        System.out.println(j);
    }
    static int j=20;
}

class Derived0 extends Base0{//--------------->child class main method will execute only
    static int x=10;
    static{
        m2();
        System.out.println("Derived Static block");
    }
    public static void main(String[] args) {
        m2();
        System.out.println("Derived main method");
    }
    public static void m2(){
        System.out.println(y);
    }
    static int y=20;
}

//Instance control flow
class Instance1{
    int x=500;
{
    m1();
    System.out.println("First Instance block ");
}
Instance1(){
    System.out.println("constructor");
}
public static void main(String[] args) {
    Instance1 i1=new Instance1();
    System.out.println(" main method");
}
public void m1(){
    System.out.println(y);
}
{
    System.out.println("second instance block");
}
 int y=20;
}


////Instance control flow from parent to child
class Instance2{
int i=600;
{
m1();
    System.out.println("Parent Instance block ");
}
Instance2(){
    System.out.println("Parent constructor");
}
public static void main(String[] args) {
    Instance2 i2=new Instance2();
    System.out.println(" Prent main method");
}
public void m1(){
    System.out.println(j);
}
int j=20;
}
class Child22 extends Instance2{
    int x=20;
    {
        m7();
        System.out.println("Child Instance block ");
    }
    Child22(){
        System.out.println("child constructor");
    }
    public static void main(String[] args) {
        Child22 c2=new Child22();
        System.out.println(" Child main method");
    }
    public void m7(){
        System.out.println(y);
    }
    int y=20;
}

//Instance Static control flow

class Intialization{
    private static String m1(String mn){
        System.out.println(mn);
        return "mona";
    }
    Intialization(){
        m=m1("1");//--------------------------------->constructor
    }
    {
        m=m1("2");//--------------------->Instance block
    }
    String m=m1("3");

    public static void main(String[] args) {
        m1("saumrit");
        Object o=new Intialization();
    }
}


//

class Intialization3 {
private static String m1(String msg){
    System.out.println(msg);
    return msg;
}
static String m=m1("1");
    {
        m=m1("2");
    }
    static{
        m=m1("3");
    }

    public static void main(String[] args) {
        Object o1=new Intialization3();
    }

}






































