package engineeringDigest.multithraedingPractice.myThreadPool.myScheduledExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerMethods {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(()->{    //it will print in every 5 second
            System.out.println("task executed after every 5 second");
        },5,5, TimeUnit.SECONDS);  //here with scheduleAtFixedRate() after every 5 sec will run the task.
        // if the task require 10 sec to finish still it will run at every 5 sec.

        scheduler.scheduleWithFixedDelay(()->{
            System.out.println("task executed after every 5 second");
        },5,5,TimeUnit.SECONDS);//here with scheduleWithFixedDelay()
        // it will run the task after 5sec of finishing the task.
        // if the task require 10 sec to finish still it will run at every 5 sec.

        scheduler.schedule(()->{    // it will shutdown after the timeout.
            System.out.println("Intiating shutDown");
            scheduler.shutdown();
        },20,TimeUnit.SECONDS);
    }
}
