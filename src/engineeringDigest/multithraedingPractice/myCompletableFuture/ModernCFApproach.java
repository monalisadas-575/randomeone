package engineeringDigest.multithraedingPractice.myCompletableFuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import java.util.concurrent.CompletableFuture;

public class ModernCFApproach {

        public static void main(String[] args) {
            try {
                String modern = CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(5000);
                        System.out.println("Worker");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    return "ok";
                }).get();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }catch(ExecutionException e){
                throw new RuntimeException(e);
            }
            System.out.println("Main");
        }
    }

