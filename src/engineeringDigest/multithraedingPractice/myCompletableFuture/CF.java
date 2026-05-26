package engineeringDigest.multithraedingPractice.myCompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(5000);
                System.out.println("Worker");
            }catch (Exception e){
                System.out.println(e);
            }
            return "ok";
        });
        /*  // without this get() main thread will not wait for worker thread. It treat worker thread as a demon thread.
        String s = null;
        try {
             s = completableFuture.get();
        }catch(InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s);

         */
        System.out.println("Main");
    }
}
