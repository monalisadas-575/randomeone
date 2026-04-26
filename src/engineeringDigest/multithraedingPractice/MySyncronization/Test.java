package engineeringDigest.multithraedingPractice.MySyncronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 =new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount()); //everytime I run get different results not 2000 every time.
        // use synchronized in increment method of Counter class.
    }
}
