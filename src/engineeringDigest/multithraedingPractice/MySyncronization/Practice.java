package engineeringDigest.multithraedingPractice.MySyncronization;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//todo this the safe unlock of deadlock given in MonaPracticeMultithreadLock
 public class Practice {

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void methodA() {
        while (true) {
            boolean gotLock1 = false;
            boolean gotLock2 = false;

            try {
                gotLock1 = lock1.tryLock();
                gotLock2 = lock2.tryLock();

                if (gotLock1 && gotLock2) {
                    System.out.println(Thread.currentThread().getName() + " got both locks in methodA");
                    break;
                }
            } finally {
                if (gotLock1) lock1.unlock();
                if (gotLock2) lock2.unlock();
            }

            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }

    public void methodB() {
        while (true) {
            boolean gotLock1 = false;
            boolean gotLock2 = false;

            try {
                gotLock2 = lock2.tryLock();
                gotLock1 = lock1.tryLock();

                if (gotLock1 && gotLock2) {
                    System.out.println(Thread.currentThread().getName() + " got both locks in methodB");
                    break;
                }
            } finally {
                if (gotLock1) lock1.unlock();
                if (gotLock2) lock2.unlock();
            }

            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        Practice obj = new Practice();

        Thread t1 = new Thread(obj::methodA, "Thread-1");
        Thread t2 = new Thread(obj::methodB, "Thread-2");

        t1.start();
        t2.start();
    }
}