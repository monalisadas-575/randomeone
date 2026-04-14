package durgasirpractise.JavalangPractice;

public class StringStringbufferPrcatice {
    String s1="Durga";
    StringBuffer s2=new StringBuffer("Durga");


    public static void main(String[] args) {

        StringStringbufferPrcatice string=new StringStringbufferPrcatice();
        string.s1.concat("solution");
        //todo 1 once we create a string object we cant perform any changes.
        // For changes we have to create new object
        System.out.println(string.s1);  // Durga

        String s3=string.s1.concat("solution");
        System.out.println(s3);  //durgasolution
        //todo new object s3 now created with following changes.

        string.s2.append("solution");
        System.out.println(string.s2);   //durgasolution

        System.out.println("=============CONSTRUCTOR===========================");
        //todo 1 this craete stringBuffer object of initial capacity 16.
        StringBuffer ss1=new StringBuffer();
        System.out.println(ss1.capacity());  //16
        ss1.append("Mona");
        System.out.println(ss1.capacity());   //16
        //todo new capacity=(current capacity=1)*2----(16+1)*2=34
        ss1.append(" is  a housewife.");
        System.out.println(ss1.capacity());   //34

        //todo 2 can create string Buffer object with specified initial capacity.
        StringBuffer ss2=new StringBuffer(23);
        System.out.println(ss2.capacity());  //23

        //todo 3 can create equivalent stringBuffer for the given string
        // with intial capacity(length of string+16)
        StringBuffer ss3= new StringBuffer("Mona");
        System.out.println(ss3.capacity());   //20-----(16+4)




    }
}
