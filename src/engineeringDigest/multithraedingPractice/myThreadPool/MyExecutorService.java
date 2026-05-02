package engineeringDigest.multithraedingPractice.myThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyExecutorService {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i = 1; i<10; i++){
            int finalI = i;
            executor.submit(()-> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();

        //before writing this try block total time was printing first but by
        // todo executor.awaitTermination() total time will print last based on task execution/ execution happen after shutdown  or timeout
        try{
            executor.awaitTermination(10, TimeUnit.SECONDS);
        }catch(InterruptedException e){
            throw new RuntimeException();
        }
        System.out.println("total time "+(System.currentTimeMillis()-startTime));
    }

    private static long factorial(int n){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            throw new RuntimeException();
        }
        long result = 1;
        for(int i=1; i<=n ; i++){
            result *= i;
        }
        return result;
    }
}
