package durgasirpractise.BeforeStringPractice;
import java.io.*;

//Inheritance Concept
class P{
    public void m1()
    {
        System.out.println("parent");
    }
}
class C extends P{
    public void m2(){
        System.out.println("child");
    }
}
class practice1{
    public static void main(String[] args){
        P p=new P();
        p.m1();
       // p.m2();
        P p1=new C();
        p1.m1();
       // p1.m2();
       // C c1=new P();

    }

}


//Overloading Concept


//Case-1

class OverLoad1{
    public void a1(int i){
        System.out.println("int argument");
    }
    public void a1(float f){
        System.out.println("float argument");
    }
    public static void main(String[] args){
      OverLoad1 ol=new OverLoad1();
      ol.a1(10);
      ol.a1(10.5F);
      ol.a1('a');//---> char type promoted to int
      //ol.a1(10.5);---> As its a long type it cant be promoted to lower type like float & int
    }
}


//Case-2(In between parent & child compiler always give precedence to child class)

class OverLoad2{
    public void b1(String s){
        System.out.println("String Version");
    }
    public void b1(Object O){
        System.out.println("Object Version");
    }

    public static void main(String[] args) {
        OverLoad2 ol2= new OverLoad2();
        ol2.b1("mona");
        ol2.b1(new Object());//----> Calling direct object
        ol2.b1(null);//---->null belongs to both String & Object but compiler give precedence to child class which is String
        ol2.b1((Object)null);//---->typecasting null ti object types
        ol2.b1(new int[]{1,2,3});//---->array is  an object
        ol2.b1( (10));//---->int but after promoting to integrer class it will be object
        ol2.b1(Integer.valueOf(10));//---->autiboxing makes Integer object with int value


    }
}




//Case-3(if both belong to same level with no relationship like String class & string Buffer it will give compiler error


class OverLoad3{
    public void c1(int i,float f){
        System.out.println("int-float version");
    }
    public void c1(float f,int i){
        System.out.println("float-int version");
    }

    public static void main(String[] args) {
        OverLoad3 ol3=new OverLoad3();
        ol3.c1(10,10.5f);
        ol3.c1(20.0f,0);
       // ol3.c1(10,10);//----> reference is ambiguous as it belongs to both method.
    }
}


//case-4

class OverLoad4{
    public void d1(int x){
        System.out.println("general method");
    }
    public void d1(int...x){
        System.out.println("var-arg method");
    }

    public static void main(String[] args) {
        OverLoad4 ol4=new OverLoad4();
        ol4.d1(10);//---->general method
        ol4.d1();//---->var-arg method
        ol4.d1(10,20);//---->var-arg method
    }
}

//Case-5

class Animal{
public void f1(){
    System.out.println("parent");
}
}
class Monkey extends Animal{
public void g1(){
    System.out.println("child");
}
}
class OverLoad5{
    public void e1(Animal a){
        System.out.println("Animal Version");
    }
    public void e1(Monkey m){
        System.out.println("Monkey Version");
    }

    public static void main(String[] args) {
        OverLoad5 ol5=new OverLoad5();
        Animal a=new Animal();
        ol5.e1(a);
        Monkey m=new Monkey();
        ol5.e1(m);
        ol5.e1(a);
        Animal a1=new Monkey();
        ol5.e1(a1);
        ol5.e1(m);
        System.out.println("-----------");
        System.out.println("-----------");
        a.f1();
        m.f1();
        m.g1();
        a1.f1();
       // a1.g1();

    }
}

//------------------------------------------------------
//------------------------------------------------------

//Overriding Examples

//ex-1
class Parent1{
    public void property(){
        System.out.println("Cash+gold");
    }
    public void marry(){
        System.out.println("Subhalaxmi");
    }
}
class Child extends Parent1{
    public void marry(){
        System.out.println("katrina");
    }
}
class Override1{
    public static void main(String[] args) {
        Parent1 p1=new Parent1();
        p1.property();
        p1.marry();
        Child c1=new Child();
        c1.property();
        c1.marry();
        Parent1 p2=new Child();
        p2.property();
        p2.marry();//-----> In overriding execution based on runtime object which answer is katrina
    }
}



// example-2 (Return type must be same for primitive types but co varient concept applicable for object class)
class Parent2{
    public Object o1(Integer I) {
     return I;
    }
}
class Child2 extends Parent2{
    public String s1(String s){
        return s;
    }
}
class Override2 {
    public static void main(String[] args) {
        Parent2 p22 = new Parent2();
        System.out.println(p22.o1(10));
        Child2 c22=new Child2();
        System.out.println(c22.s1("10"));
        System.out.println( c22.o1(20));
    }

}


//Example-3(private methods in parent class Child class will be same)

class Parent3{
    private void p12(){
        System.out.println("null");
    }
}
class Child3 extends Parent3{
     private void p12(){
         System.out.println("child");
    }
}
class Override3{
    public static void main(String[] args) {
        Parent3 p23= new Parent3();
       // p23.p12();---> private class method not avaialble outside class
    }
}



//example-4(parent class abstract method  override in the child class)
abstract class Abs{
    public abstract void h1();
}
class ChildAbs extends Abs{
    public void h1(){
        System.out.println("child class of abstract");
    }
}
class Override4{
    public static void main(String[] args) {
       ChildAbs ab1=new ChildAbs();
       ab1.h1();//---> we can stop implementation in parent class & implement in child class

    }
}


//Example-5(we cant decrease the power of modifier in child class but we can increase

class Parent5{
    protected void p5(){
        System.out.println("protected parent");
    }
}
class Child5 extends Parent5{
    public void p5(){
        System.out.println(" public child");
    }
}
class Override5{
    public static void main(String[] args) {
        Parent5 p55= new Parent5();
        p55.p5();//--->for protected modifier we can oly use protected/public
        Parent5 p56=new Child5();
        p56.p5();//------> parent class refernce & child class object answer will be child class

    }
}


//Example-6(If child class contain checked Exception then parent must contain same or its parent type
class ExceptionExample{
    public void ex() throws Exception{
        System.out.println("checked exception--Parent class");
    }
}
class childException extends ExceptionExample{
    public void ex() throws IOException{
        System.out.println("IO Exception--child class");
    }
}
class Override6{
    public static void main(String[] args) throws Exception {
        ExceptionExample E66 = new ExceptionExample();
        E66.ex();//--->
    }
}


//Example-7------> we cant override a static method as no-static method
class StaticParent{
    public static void se(){
        System.out.println("Static parent");
    }
}
/*
class StaticChild extends StaticParent{
    public void se(){
        System.out.println("Non static child");
    }
}*///-------------------->cant extend as parent is static
class Override7{
    public static void main(String[] args) {
        StaticParent sp=new StaticParent();
        sp.se();

    }
}

//------------------------------------------------------------------
//---------------------------------------------------------------------

//Method hiding


class HidingParent{
    protected static void hide(){
        System.out.println("static parent");
    }
}
class HidingChild extends HidingParent{
    public static void hide(){
        System.out.println("static child");
    }
}
class HidingExample {
    public static void main(String[] args) {
        HidingParent hp = new HidingParent();
        hp.hide();//--->
        HidingChild hc=new HidingChild();
        HidingParent hp1 = new HidingChild();
        hp1.hide();//------>parent reference child object but answer is Staticchild as its  method hiding

    }
}



//example-8(overriding wrt variable)
class OverridingParent{
    int x=888;
}
class OverridingChild extends OverridingParent{
    int x=999;
}
class OverridingVariableExample{
    public static void main(String[] args) {
        OverridingParent op=new OverridingParent();
        System.out.println(op.x);
        OverridingChild oc=new OverridingChild();
        System.out.println(oc.x);
        OverridingParent oc1=new OverridingChild();
        System.out.println(oc1.x);//----->method resolution takes care by compiler based on refernce type
    }
}


//Example-9(confusion from dunu-->Static member in class overloading)
class A{
    public static int x=80;
    public static int y=90;
}
class Ba extends A{
//public static int x=10;
}
class Ca {
    public static void main(String[] args) {

        Ba B2=new Ba();
        System.out.println(Ba.x);
        System.out.println(B2.y);

    }
}


