package engineeringDigest.multithraedingPractice.myThreadPool.myScheduledExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerMethods {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(()->{    //it will print in every 5 second
            System.out.println("task executed after every 5 second");
        },5,5, TimeUnit.SECONDS);

        scheduler.schedule(()->{    // it will shutdown after the timeout.
            System.out.println("Intiating shutDown");
            scheduler.shutdown();
        },20,TimeUnit.SECONDS);
    }
}
