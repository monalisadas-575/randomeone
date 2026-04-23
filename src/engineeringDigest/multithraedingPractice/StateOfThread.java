package engineeringDigest.multithraedingPractice;

public class StateOfThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StateOfThread s1= new StateOfThread();
        System.out.println(s1.getState());
        s1.start();
        System.out.println(s1.getState());
        Thread.sleep(100);
        System.out.println(s1.getState());
        s1.join(); //here main method was waiting s1 thread to get finished.
        System.out.println(s1.getState());  //s1 has terminated so state will show after some time
    }
}
