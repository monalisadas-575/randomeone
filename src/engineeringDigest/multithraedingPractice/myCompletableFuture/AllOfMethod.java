package engineeringDigest.multithraedingPractice.myCompletableFuture;

import java.util.concurrent.CompletableFuture;

public class AllOfMethod {
    public static void main(String[] args) {

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(5000);
                System.out.println("Worker");
            }catch (Exception e){
                e.printStackTrace();
            }
            return "OK";
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(5000);
                System.out.println("Worker");
            }catch (Exception e){
                e.printStackTrace();
            }
            return "OK";
        });

        CompletableFuture<Void>  f = CompletableFuture.allOf(f1,f2);
        f.join();
        System.out.println("Main");
    }
}
