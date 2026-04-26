package engineeringDigest.multithraedingPractice.MySyncronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {
    private final Lock unFairlock = new ReentrantLock(true);
    //By adding fairness true it will give access to that thread first whi will request first

    public void accessResource(){
        unFairlock.lock();
        try{
            System.out.println(Thread.currentThread().getName() +" acquired the lock");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() +" released the lock");
            unFairlock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockExample lock = new FairnessLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                lock.accessResource();
            }
        };

        Thread t1= new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        Thread t3 = new Thread(task,"Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
