package engineeringDigest.multithraedingPractice.myCompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public  class ThenApplyMethod{
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> modern = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (Exception e) {
                System.out.println(e);
            }
            return "ok";
        }).thenApply(x -> x + x);
        System.out.println(modern.get());
    }
    // here okok will print
}
