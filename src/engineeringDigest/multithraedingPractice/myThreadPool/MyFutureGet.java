package engineeringDigest.multithraedingPractice.myThreadPool;

import java.util.concurrent.*;

public class MyFutureGet {
    public static void main(String[] args)  {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<Integer> future = ex.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Execption occured " + e);
            }
            return 42;
        });

        Integer i =null;
        try {
            i = future.get(5, TimeUnit.SECONDS);
            System.out.println(future.isDone());
            System.out.println(i);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Execption occured " + e);
        }
        ex.shutdown();

    }
}
