package harrypractise.multithreading;
//Creating thread by extending thread class
/*    class MyThread extends Thread{
        public void run(){
            int i=0;
            while(i<4000){
                System.out.println("My thread is running");
                System.out.println("I am happy!");
                i++;
            }
        }
    }class MyThread2 extends Thread{
        public void run(){
            int i=0;
            while(i<4000){
                System.out.println("Thread 2 is good");
                System.out.println("I am sad!");
                i++;
            }
        }
    }
public class prcatice_multithreading {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();

    }
}*/



//Creating thread by implementing runnable interface
/*
class MyThread11 implements Runnable{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("i am thread 11 of Runnable");
            System.out.println("I am happy!");
            i++;
        }
    }
}class MyThread12 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("I am thread 12 of runnable");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class prcatice_multithreading {
    public static void main(String[] args) {
MyThread11 t1=new MyThread11();
Thread bul=new Thread(t1);
MyThread12 t2=new MyThread12();
Thread bil2=new Thread(t2);
bul.start();
bil2.start();
    }
}*/




//Thread Constructor(String name)
/*
class Thr extends Thread{
    public Thr(String name){
        super(name);//    this.setName(name):-->it will work in the place of super(name)
    }
    public void run(){
        int i=34;
        System.out.println("Thank you");
        while(i!=34){
            System.out.println("I am thread");
        }
    }
}
public class prcatice_multithreading{
    public static void main(String[] args) {
     Thr t=new Thr("Harry");
     t.start();
        System.out.println("The id of the thread t is :"+t.getId());
        System.out.println("The name of the thread t is :"+t.getName());
    }

}*/


// Thread constructor(Runnable, String name)
/*
class MyRun implements Runnable{
    public void run(){
   // System.out.println(" ");
    }
}
public class prcatice_multithreading{
    public static void main(String[] args) {
        MyRun R1=new MyRun();
        Thread t1=new Thread(R1,"My custom Thread");
        t1.start();
        System.out.println("Thread Id is :"+ t1.getId());
        System.out.println("Thraed name is :"+t1.getName());
    }
}*/



//Thread

class ThreadPr extends Thread{
       ThreadPr(String name){
        super(name);
    }
    public void run(){
        int i=30;
        while(i==30){
            System.out.println("Thank You "+this.getName());
        }
    }
}
public class prcatice_multithreading{
    public static void main(String[] args) {
        ThreadPr t1=new ThreadPr("Harry12");
        ThreadPr t2=new ThreadPr("Mona12");
        ThreadPr t3=new ThreadPr("saumrit12");
        ThreadPr t4=new ThreadPr("Monalisa");
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MAX_PRIORITY);
t3.setPriority(Thread.MIN_PRIORITY);
t4.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
t3.start();
t4.start();

    }
}
