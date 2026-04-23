package engineeringDigest.multithraedingPractice;

public class ThreadMethod extends Thread{
    public ThreadMethod(String name){
        super(name);
    }

    @Override
    public void run() {
      for(int i=0;i<5;i++){
          System.out.println(Thread.currentThread().getName()+" is running");
          Thread.yield(); //--//--It ie written to give other thread
      }
    }

    public static void main(String[] args) {
        ThreadMethod t1 = new ThreadMethod("t1");
        ThreadMethod t2 = new ThreadMethod("t2");
        t1.start();
        t2.start();
    }
}
