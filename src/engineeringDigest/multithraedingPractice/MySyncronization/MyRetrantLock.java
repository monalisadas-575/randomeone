package engineeringDigest.multithraedingPractice.MySyncronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//todo all methods of lock are explained here like: lock(), unlock(),
// tryLock() with and without time, deadLock prevention ,lockInterruptibility()

public class MyRetrantLock {
    private final Lock lock =new ReentrantLock();

    public void outerMethod(){
        lock. lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("inner method");
        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        MyRetrantLock mr1 = new MyRetrantLock();
       // MyRetrantLock mr2 = new MyRetrantLock();
        mr1.outerMethod();
        //mr2.innerMethod();
    }
}
