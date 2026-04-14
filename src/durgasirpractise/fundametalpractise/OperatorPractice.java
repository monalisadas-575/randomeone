package durgasirpractise.fundametalpractise;

public class OperatorPractice {


    //TODO Increment /decrement operator #1 applicable only for variable not with value
    int y=10;
     public int x=++y;
    //int z=++10;       //Variable expected

    //TODO Increment /decrement operator #2  not applicable for final variable
    final int x1=10;
    //int y1=++x1;   //Can't assign value to final variable

    //TODO Increment /decrement operator #3 applicable for every primitive except boolean
    char c1='b';
    char c2=++c1;
   // c1++;   //This is a statement not a declaration should be inside a method
    boolean b1=true;
    //boolean b2=++b1;    // bad operand type boolean for unary operator '++'

    //TODO arithmetic operator #1 apply b/w 2 variable. result type always max
    long l1=12347899898989L;
    int x4=67886;
    long xl=l1+x4;
    //TODO arithmetic  operator #2 infinity can be reperesent only  in floating type data type otherwise Arithmetic Exception
    float f1=98.12f;
    float f2=f1/0;               //Infinity
    static Object o1=new String("Saumrit");
     static String s1=new String("Mona");
     static String s2=new String("Mona");
      static StringBuffer sb=new StringBuffer("Mama");





    public static void main(String[] args) {
        OperatorPractice op1 = new OperatorPractice();
        System.out.println(op1.x);
        System.out.println(op1.c2);
        System.out.println(op1.xl);
        System.out.println(op1.f2);

        //TODO Relational operator #1 apply to every primitive type except boolean
        System.out.println(op1.f1 < 976.678);   //true
        System.out.println(op1.c2 > 56789.09);   //false
        System.out.println(op1.l1 > op1.xl);
        // System.out.println(true>false);  //Operator '>' cannot be applied to 'boolean'

        //TODO Relational operator #1 can't apply on object type
        //System.out.println("Saumrit"<"Mona");  //Operator '<' cannot be applied to 'java.lang.String'

        //TODO Equality operator #1 for object type compulsory there should be some relation(Prent-child or vice versa)
        System.out.println(o1 == s1);     //false
        // System.out.println(sb==s1);     //Operator '==' cannot be applied to (No relation b/w String Buffer & string)

        //TODO Difference b/w ==operator &.equals()
        System.out.println(s1 == s2);        //Address Comparision
        System.out.println(s1.equals(s2));      ////Content Comparision

        //TODO instanceOf Operator
        Thread t1 = new Thread();
        System.out.println("-------------------------");
        System.out.println(t1 instanceof Thread);    //true
        System.out.println(t1 instanceof Object);   //true
        // System.out.println(t1 instanceof String); // always false

    }


}

