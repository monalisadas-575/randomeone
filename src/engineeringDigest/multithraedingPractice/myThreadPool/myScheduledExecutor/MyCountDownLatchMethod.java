package engineeringDigest.multithraedingPractice.myThreadPool.myScheduledExecutor;

import java.util.concurrent.*;

class DepedentService implements Callable<String> {
    private final CountDownLatch latch;

    public DepedentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            System.out.println(Thread.currentThread().getName()+" service running");
            Thread.sleep(200);
        }finally{
            latch.countDown();
            return "ok";
        }
    }

}
public class MyCountDownLatchMethod{
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        int numberOfService=3;
        ExecutorService ex = Executors.newFixedThreadPool(numberOfService);
        CountDownLatch latch =new CountDownLatch(numberOfService);
        ex.submit(new DepedentService(latch));
        ex.submit(new DepedentService(latch));
        ex.submit(new DepedentService(latch));
        latch.await();
        System.out.println("main");
        ex.shutdown();


    }
}
