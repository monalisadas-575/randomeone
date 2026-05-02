package engineeringDigest.multithraedingPractice.myThreadPool;

import java.util.concurrent.*;

public class ExecutorServiceMethods {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex  = Executors.newSingleThreadExecutor();
        Runnable runnable = ()-> System.out.println("hello");
        //Runnable runnable1 = ()->"hello"; //todo run() doesn't return anything.It can only execute something
        Callable<String> callable = ()->"hello"; // but callable can return
        Future<String> future = ex.submit(()->"hello");
        future.get();
        ex.shutdown();
    }
}
