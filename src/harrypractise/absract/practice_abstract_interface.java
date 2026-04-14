package harrypractise.absract;
//Concept of abstract class
/*
abstract class parent{
   public parent(){
       System.out.println("I am a constructor");
   }
   public void sayHello() {
       System.out.println("Hello");
   }
   abstract public void greet();
   abstract public void greet2();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    } @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class child3 extends parent{
    public void tho(){
        System.out.println("I am good");
    }
}
public class practice_abstract_interface {
    public static void main(String[] args) {
        //parent p=new parent();
        child c=new child();
        //child3 c1= new child3();
        c.greet2();
        c.sayHello();
    }
}*/





//Interface in java
/*
interface  Bicycle{
  int applyBrake(int decrement);
  void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    int speed=7;
    public int applyBrake(int decrement){
        speed=speed-decrement;
        return speed;
    }
    public void speedUp(int increment){
        speed=speed+increment;
    }
}
    public class practice_abstract_interface {
        public static void main(String[] args) {
            AvonCycle cyl=new AvonCycle();
            System.out.println(cyl.applyBrake(2));
        }
}*/





//Concept Interface
/*
interface bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class avon implements bicycle{
    void blowhorn(){
        System.out.println("pee pee");
    }
    public void applyBrake(int decrement){
        System.out.println("applying brake");
    }
    public void speedUp(int increment){
        System.out.println("applying speedup");
    }
}
public class practice_abstract_interface{
    public static void main(String[] args) {
        avon cycle= new avon();
        cycle.applyBrake(2);
        System.out.println(bicycle.a);
    }
}*/





//Implement multiple interface

interface  bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface hornBicycle {
    void blowHornK3g();
    void blowHornMhn();
}
class Avon implements bicycle,hornBicycle{
    void bow(){
        System.out.println("pee pee");
    }
     public void applyBrake(int decrement){
         System.out.println("applying brake");
    }public void speedUp(int increment) {
        System.out.println("Speeding up");
    }
    public void blowHornK3g(){
        System.out.println("kabhi khusi kabhi gum");
    }
    public void blowHornMhn(){
        System.out.println("Mqin hoon naa");
    }
}
public class practice_abstract_interface{
    public static void main(String[] args) {
         Avon Harry= new Avon();
         Harry.applyBrake(2);
        System.out.println(bicycle.a);//As its a static constant we can write. It belongs to its own interface.
        Harry.blowHornK3g();
    }
}


/**
 * This is a real life example to explain the use of interface in java.
 * Suppose we have a student interface that contatins a method called studying().
 * Diffreent type of students-such as mechanical, Civil, It, electrical and chemical students will implement this interface.
 * Each student class provides its own version of studying method, where example of civil engineering output will be "Studying civil engineering".and so on.
 * This way the client can interact with the student interface and call studying() method. and the specific implementation will depend on the type of student.
 * This also demonstrate polymorphism.

 */





