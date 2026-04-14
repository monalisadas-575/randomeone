package durgasirpractise.fundametalpractise.util3.bhbbbju;

public class ImplementationPractice implements Left,Right {
    @Override
    public void m1() {
        //System.out.println("Inside m1 method of class");
        Left.super.m1();
        Right.super.m1();
    }

    //todo after 1.8 version we can declare default method inside Interface &
    // in implementation class we can implement both left& right Inteface we can Override by our own.
    // otherwise we can call super methods

    public static void main(String[] args) {
        ImplementationPractice ip1=new ImplementationPractice();
        ip1.m1();
    }


}
