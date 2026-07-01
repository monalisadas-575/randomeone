package engineeringDigest.multithraedingPractice.myThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutorCancel {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> submit = executor.submit(() -> {
            try {
                System.out.println("thread is printing before sleep");
                Thread.sleep(2000);
                System.out.println("thread is printing after sleep");
            } catch (InterruptedException e) {
                System.out.println("execution occured: " + e);
            }
                return 42;
        });
        try {    //todo here we are doing work by the main thread so as it is working submit.cancel(false) will not interruot here.
            Thread.sleep(1000);
        } catch (InterruptedException  e) {
            e.printStackTrace();
        }
        submit.cancel(false); //it will cancel the work even if it is running sumbit.cancel(true)

        //if it is false then it will not stop running thread.
        System.out.println(submit.isCancelled());
        executor.shutdown();
    }
}
