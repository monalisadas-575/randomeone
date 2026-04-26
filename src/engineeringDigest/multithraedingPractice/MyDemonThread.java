package engineeringDigest.multithraedingPractice;

public class MyDemonThread extends Thread {
    public MyDemonThread(String name) {
        super();
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("hello world!");
        }
    }

    public static void main(String[] args) {
        MyDemonThread userThread = new MyDemonThread("Mona");

        //Main thread always wait for User thread to finish before exit
        //userThread.start();

        MyDemonThread demonThread = new MyDemonThread("Demon");
        demonThread.setDaemon(true);

        //if we set our thread daemon thread that mean main thread will not for daemon thread.
        // It will exit.It treats daemon thread as a background thread.

        demonThread.start();
        System.out.println("main done");
    }
}
