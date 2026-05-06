package engineeringDigest.multithraedingPractice;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//todo this is the deadlock example
public class MonaPracticeOnMultithreadLock {
    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();

                public void methodA() {
                    lock1.lock();
                    try {
                        System.out.println("A got lock1");
                        lock2.lock();
                        try {
                            System.out.println("A got lock2");
                        } finally {
                            lock2.unlock();
                        }
                    } finally {
                        lock1.unlock();
                    }

                 }

    public void methodB() {
        lock2.lock();
        try {
            System.out.println("B got lock2");
            lock1.lock();
            try {
                System.out.println("B got lock2");
            } finally {
                lock1.unlock();
            }
            } finally{
            lock2.unlock();
        }
    }

        public static void main (String[]args){
            MonaPracticeOnMultithreadLock mona = new MonaPracticeOnMultithreadLock();
            Runnable task1 = mona::methodA;
            Runnable task2 = mona::methodB;
            Thread thread1 = new Thread(task1, "thread-1");
            Thread thread2 = new Thread(task2, "thread-2");
            thread1.start();
            thread2.start();
        }
    }

