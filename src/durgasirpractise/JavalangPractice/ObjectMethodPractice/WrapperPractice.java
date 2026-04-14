package durgasirpractise.JavalangPractice.ObjectMethodPractice;

import java.awt.*;

public class WrapperPractice {
    public static void main(String[] args) {

        //todo 1 we can't create wrapper class object by using constructor as it is deprecated from java 9.
        // to create wrapper class object use utility methods/autoboxing.
       // Integer i1=new Integer("10");
        //Boolean b1=new Boolean(true);

        System.out.println("=======VALUE OF============");
        //todo 1 value of() create wrapper object for the given string.
        Integer i1=Integer.valueOf("100");     //100
        Float f1=Float.valueOf("10.5f");
        System.out.println(f1.getClass().getName());  //java.lang.Float
        Character c1=Character.valueOf('z');


        //todo for boolean type if the allowed type is string, & true it will treat as true otherwise false
        Boolean b2=Boolean.valueOf("True");
        Boolean b3=Boolean. valueOf("true");
        Boolean b4=Boolean. valueOf("TRUE");
        Boolean b1=Boolean.valueOf("durga");   //false

        //todo 2 value of() create wrapper object for the  given primitive.
        //todo if we pass boolean primitive as argument then case & content both are important.
        Boolean bb1=Boolean.valueOf(true);
        Boolean bb2=Boolean.valueOf(false);
        //Boolean bb3=Boolean.valueOf(TRUE);  //Error: can't resolve symbol.
        Integer i2=Integer.valueOf(100);  //primitive int(100) converted into object i2.
        System.out.println(i2.equals(i1));    //false
        System.out.println("==hash==="+i2.hashCode());

        System.out.println(i1+","+b1+","+b2+","+b3+","+b4);   //100,false,true,true,true
        System.out.println(bb1+","+bb2);     //true,false

        //todo 3 every integral type wrapper class(byte,short, integer,long) create object for given specified radix.
        //public static wrapper valueOf(String S,int radix)
        Integer i3=Integer.valueOf("111",2);  //7
        Long l1=Long.valueOf("111",3);   // allowed range of radix is 2,36
        System.out.println(i3+","+l1);     //7,13

        System.out.println("==============XXXValue()===================");
        //todo 4 XXXValue() every number type wrapper class(byte,Short,Long,Integer,Float,double)contain these method.
        System.out.println(i1.byteValue());   //100
        System.out.println(i1.shortValue());   //100
        System.out.println(i1.intValue());     //100
        System.out.println(i1.longValue());     //100
        System.out.println(i1.floatValue());    //100.0
        System.out.println(i1.doubleValue());    //100.0
        int i100=i1; // 100 has assigned to int type variable.

        //todo 5 charValue(), booleanValue() used to get char & boolean primitive from the given char & boolean object
        char c23=c1.charValue();
        System.out.println(c23);   //z
        System.out.println(bb1.booleanValue());  //true

        System.out.println("=========toString============");
        //todo 6 toString() to convert primitive/wrapper object to string
        String s1=Boolean.toString(b1);
        String s2=Integer.toString(i3);
        System.out.println(s1+","+s2);      //false,7
        String s3=Character.toString('M');  //is is char primitive type
        System.out.println(s3);
        String s4=Character.toString(c1);  //c1 is the character class wrapper object
        System.out.println(c1);

        //todo 7 toString() to convert primitive with radix
        String s5=Integer.toString(16,2);
        System.out.println(s5);   //10000
        String s6=Long.toString(100,5);
        System.out.println(s6);   //400
        System.out.println(s6.getClass().getName());   //java.lang.String

        //todo 8 toXxxString() Integer & long classes contain the following binary,octal, HexString methods
        String s7=Integer.toBinaryString(100);
        System.out.println(s7);   //1100100
        System.out.println(Integer.toHexString(i2));   //64
        System.out.println(Integer.toOctalString(100));   //144

        System.out.println("===========parseXXX=================");
        //todo 7 parseXXX() convert string to primitive in every wrapper class except character class.
        int i5=Integer.parseInt("111");
        float fparse=Float.parseFloat("100.0f");
        System.out.println(i5+","+fparse);
        //char c100=Character.parseCharacter();---error
        System.out.println(Integer.parseInt(s7));    //1100100
        int i6=Integer.parseInt(s6);
        System.out.println(i6);     //400

        //todo 8 every integral type wrapper class(Integer,byte,Short,Long) contain specified radix string to primitive
        Integer i20=Integer.parseInt("1111",3);
        System.out.println(i20);      //40

        //todo in addition to String object all wrapper class objects are immutable.
        // though i2 was created earlier by reassigning new i2 got created with different hashcode

        System.out.println("===hash==="+i2.hashCode());
        i2=i1+i3;
        System.out.println("===hash==="+i2.hashCode());
        Integer i10=new Integer(107);
        System.out.println(i10.hashCode());

        //todo valueOf() ---primitive/String            to   wrapper object,
        // XXXValue()    ---wrapper object              to   primitive value ,
        // parseXXX()    ---String                      to   primitive type
        // toString()    ---primitive/wrapper object    to    string











    }
}
