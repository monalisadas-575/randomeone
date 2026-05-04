package engineeringDigest.multithraedingPractice.myThreadPool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MyInvokeTimeoutMethod {
    public static void main(String[] args)  {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> callable1 = ()->{
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = ()->{
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = ()->{
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };
        List<Callable<Integer>> list1 = Arrays.asList(callable1,callable2,callable3);
        List<Future<Integer>> futures = null;
        try {
            futures = executor.invokeAll(list1,1, TimeUnit.SECONDS); //todo for 1 second it let the thread work after it cancel all.
        } catch (InterruptedException e) {        //todo for that only Task 2, Taks 3 not printed.
            throw new RuntimeException(e);
        }
        for (Future<Integer> f : futures) {
            try {
                System.out.println(f.get());
            } catch (CancellationException e) {
                System.out.println("Task was cancelled");
            } catch (ExecutionException e) {
                System.out.println("Task failed: " + e.getMessage());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
