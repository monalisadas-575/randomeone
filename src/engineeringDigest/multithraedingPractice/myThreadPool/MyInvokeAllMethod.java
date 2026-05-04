package engineeringDigest.multithraedingPractice.myThreadPool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MyInvokeAllMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> callable1 = ()->{
            System.out.println("Task1");
            return 1;
        };
        Callable<Integer> callable2 = ()->{
            System.out.println("Task2");
            return 2;
        };
        Callable<Integer> callable3 = ()->{
            System.out.println("Task3");
            return 3;
        };
        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
        List<Future<Integer>> futures =executor.invokeAll(list);
        for(Future<Integer> f:futures){
            System.out.println(f.get());
        }
        System.out.println("Hello World !"); // invokeAll() blocks main thread it finishes its own work first.
        executor.shutdown();
    }
}
