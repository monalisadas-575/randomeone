package durgasirpractise.PrcaticeOnJava8;


import java.util.function.Supplier;

public class CreateRandomNo {

    public static void main(String[] args) {
        //it prints value in between 0 to 1; where min value is o.
        //todo print value in between 0 to 9 we have to multiply 10 & typecast to int type becoz it return double type.
        //double s=Math.random();
        //int s=(int)Math.random()*10;
        for(int i=0;i<9;i++){
            int s=(int)(Math.random()*100);
            System.out.println(s);
        }
        /*
        todo Problem-1 create a program using supplier who return 6 digit password everytime it calls.
         */
        Supplier<String> s1=()->{
            String otp="";
            for(int i=0;i<6;i++){
                otp=otp+(int)(Math.random()*10);
            }return otp;
        };
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());


    }
}
