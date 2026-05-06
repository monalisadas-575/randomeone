package engineeringDigest.multithraedingPractice;

public class MyThreadMethod extends Thread{

    public MyThreadMethod(String name){ //this is to set thread name manually.So setting a constructor passing a name parameter.
        super(name);
    }
    //This will print 1 to 5 one after one with interval of 1 sec.
    @Override
    public void run() {
        /*
        for(int i= 1; i<=5; i++ ){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
         */
        for (int i=0; i<=5; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " -Priority- " + Thread.currentThread().getPriority() + " -count- " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThreadMethod t1 = new MyThreadMethod("High Priority");
        MyThreadMethod t2 = new MyThreadMethod("Medium Priority");
        MyThreadMethod t3 = new MyThreadMethod("Low Priority");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();// here main thread will wait for t1, t2, t3 to finish  then it will print "Hello after 5 sec".
        System.out.println("Hello after 5 sec");
    }
}
