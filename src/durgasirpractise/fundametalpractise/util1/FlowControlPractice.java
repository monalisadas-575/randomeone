package durgasirpractise.fundametalpractise.util1;

public class FlowControlPractice {
    static int a=10;
     static int b=20;
    final static int a1=10;
    final static int b1=20;

    public static void main(String[] args) {
      for(int i=0;i<5;i++){
          System.out.println("This is allowed");
      }

      for (int k=0;a<b;k++){
          System.out.println("Hello");
      }
        System.out.println("Hi");

        //TODO unreachable statement type-1
        /*
        for(int j=0;true;j++){
          System.out.println(" ");
      }
        System.out.println("This will never execute");-->1st loop always true never end

         */

         //TODO unreachable statement type-2
          for(int m=0;a1<b1;m++){
              System.out.println("Hello");
          }
        //System.out.println("hii");//-->As final(a1,b1) variable so it above for loop always true never end




    }
}
