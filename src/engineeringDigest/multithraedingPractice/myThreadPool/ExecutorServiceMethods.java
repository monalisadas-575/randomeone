package engineeringDigest.multithraedingPractice.myThreadPool;

import java.util.concurrent.*;

public class ExecutorServiceMethods {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex  = Executors.newSingleThreadExecutor();
        Runnable runnable = ()-> System.out.println("hello");
        //Runnable runnable1 = ()->"hello"; //todo run() doesn't return anything.It can only execute something
        Callable<String> callable = ()->"hello"; // but callable can return
        Future<String> future = ex.submit(()->"hello");
        System.out.println(future.get());
        ex.shutdown();
        System.out.println(ex.isShutdown());
        //Thread.sleep(2);  without tis sleep line is Terminated will show false
        // because suddenly after shutdown thraed wont be terminated right away
        System.out.println(ex.isTerminated());
    }
}
