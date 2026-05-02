package engineeringDigest.multithraedingPractice.MySyncronization;

public class Counter {
    private int count;

    //This below increment() called raised condition
    //becoz multiple threads are working simultaneously on this so results are concerned.

    public  void increment(){
        synchronized (this){
            count++;
        }

    }

    // todo mutual exclusion here called to check multiple threads not to access critical section.It provides solution for it.

    /*Here instead of writing public Synchronized void Increment ()
    if multiple works are going on then we use synchronized block .
    this means if more than one object are working concurrently it refers to current only.
     only one allowed to run this Synchronized block
     */

    public int getCount(){
        return count;
    }
}
