package engineeringDigest.multithraedingPractice.myThreadPool.myScheduledExecutor;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Subsystem implements Runnable{
    private String name;
    private int initializationTime;
    private CyclicBarrier barrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(name + "initialization started ");
            Thread.sleep(initializationTime);
            System.out.println(name + "initialization complete");
            barrier.await();
        }catch(InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
public class CyclicBarrierMethod {
    public static void main(String[] args) {
        int numberOfSubSystem =4;
        CyclicBarrier barrier = new CyclicBarrier(numberOfSubSystem, new Runnable() {
            @Override
            public void run() {
                System.out.println("All subsystem are up and running.System startup complete");
            }
        });

        Thread webServerThread = new Thread(new Subsystem("web server",2000,barrier));
        Thread dataBaseThread = new Thread(new Subsystem("data base",4000,barrier));
        Thread cacheThread = new Thread(new Subsystem("cache",3000,barrier));
        Thread messagingThread = new Thread(new Subsystem("messaging service",3500,barrier));

        webServerThread.start();
        dataBaseThread.start();
        cacheThread.start();
        messagingThread.start();
    }
}
