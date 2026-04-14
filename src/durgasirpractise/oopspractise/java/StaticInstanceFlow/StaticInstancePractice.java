package durgasirpractise.oopspractise.java.StaticInstanceFlow;

public class StaticInstancePractice {
    public static String s1(String msg){
        System.out.println("----------inside public sttaic method------");
        System.out.println(msg);
        return msg;
    }
    static{
        System.out.println("first static block");
        s1("1");

    }
    StaticInstancePractice(){
        System.out.println("constructor");
    }
    static int a=17;
    int b=20;
    static int count=0;
    {
        System.out.println("1st instance block");
        count=count+1;
        System.out.println(count);
    }
    private String i1(){
        System.out.println("======inside instance method");

       StaticInstancePractice sip2=new StaticInstancePractice();
//        System.out.println(sip2.b);
        return "Private instance method";
    }

    public static void main(String[] args) {
        StaticInstancePractice sip=new StaticInstancePractice();
       String s2= sip.i1();
        System.out.println(s2);
       System.out.println(sip.b);
       StaticInstancePractice sip3=new StaticInstancePractice();
       System.out.println(sip3.i1());
    }



}
