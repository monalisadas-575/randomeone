package harrypractise.inhertitance;


//Inheritance
/*
class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting X now.");
        this.x = x;
    }
}
    class derived extends Base{
     public int y;

        public int getY() {
            return y;
        }
        public void setY(int y) {
            this.y = y;
        }
    }

public class practice_concept {
    public static void main(String[] args) {
     Base B1=new Base();
     B1.setX(4);
     System.out.println(B1.getX());
     derived d1=new derived();
     d1.setX(20);
     d1.setY(10);
        System.out.println(d1.getY());
        System.out.println(d1.getX());
    }
}*/




//Constructor in inheritance
/*
class base1{
 public base1(){
     System.out.println("I am a constructor");
 }
}
class derived extends base1{
    public derived() {
        System.out.println("I am a derived class constructor");
    }
}
public class practice_concept{
    public static void main(String[] args) {
       derived d2=new derived();

    }
}*/






//Constructor overloading
/*
class base2{
    public base2(){
        System.out.println("I am a constructor");}
     public base2(int x){
        System.out.println("I am overload with value x:"+x);
    }
}
class derived2 extends base2{
    derived2(){
        //super(0);
        System.out.println("I am derived");
    }
    derived2(int x, int y){
        super(x);
        System.out.println("I am an overload of derived with value y :"+y);
    }
}
class child extends derived2{
    child(){
        System.out.println("I am child of derived");
    }
    child(int x, int y, int z){
        System.out.println("I am an overload of derived with value of z:"+z);
    }
}
public class practice_concept {
    public static void main(String[] args) {
        //base2 b2=new base2(4);
        derived2 d2= new derived2(4,5);
    }
}*/






// Example:
/*
class ekclass{
    int a;
    public int getA(){
        return a;
    }
    ekclass(int a) {
        this.a = a;
    }
    public int one(){
        return 1;
    }
}
class class2 extends ekclass{
    class2(int c){
        super(c);
        System.out.println("I am constructor");
    }
}
public class practice_concept{
    public static void main(String[] args) {
        ekclass e=new ekclass(65);
        class2 d=new class2(5);
        System.out.println(e.getA());
    }
}*/







//Method overriding
/*
class a{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class 4");
    }
}
class b extends a{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class b");
    }
    public void meth3(){
        System.out.println("I am method 3 of class b");
    }
}
public class practice_concept{
    public static void main(String[] args) {
        a a2=new a();
        a2.meth2();
        b b2=new b();
        b2.meth2();

    }
}*/






//Dynamic method dispatch

class phone{
    public void greet(){
        System.out.println("Good Morning");
    }public void on(){
        System.out.println("Turning on phone");
    }
} class smartphone extends phone{
    public void swagat(){
        System.out.println("Apka swagat hai");
    }
    public void on(){
        System.out.println("Turning on smartphone");
    }
}
public class practice_concept{
    public static void main(String[] args) {
        //phone obj= new phone();
        // smartphone sm=new smartphone();
        //obj.greet();
        phone obj= new smartphone();
        //smartphone sm=new phone();(not allowed
        obj.greet();
        obj.on();
        //obj.swagat(); this will not work. even though it is an smartphone object still declared type is phone. so phone doesnt have swagat method .

    }
}














































































































