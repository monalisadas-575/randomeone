package durgasirpractise.JavalangPractice.ObjectMethodPractice;

public class AutoboxingUnboxingPractice {
    //todo a.b means convert primitive to wrapper object.(internally implement valueof()method
    //ab--autoboxing(primitive to wrapper object) ,  aub--auto unboxing(wrapper object to primitive
    Integer i1=10;  //ab
    static Integer i;

    Integer x1=30;
    Integer y1=x1;

    Integer x2=127;
    Integer x3=127;
    Integer x4=128;
    Integer x5=128;


    public static void main(String[] args) {
        AutoboxingUnboxingPractice obj=new AutoboxingUnboxingPractice();
        int i20= obj.i1;  //aub
        m1(i20);  // ab---for method call int upgraded to Integer object
        //int m=i;  //internally it will call i.intValue();---Aub
       // System.out.println(m);  //as it stores null so NPE

        obj.x1++;
        System.out.println(obj.x1);    //31
        System.out.println(obj.y1);    //30
        System.out.println(obj.x1==obj.y1);   //false
        System.out.println("===BUFFER ZONE EXAMPLE=====");
        //todo 1 for Integer buffer concept range is -128 to 127 .
        // if object is already present within buffer range existing will be reused.
        System.out.println(obj.x2==obj.x3);   //true
        System.out.println(obj.x4==obj.x5);   //false
        //todo 2 for Short , Long ,Byte, Integer wrapper class range -128 to 127.
        // For character 0-127, Boolean always
        Short s1=100;
        Short s2=100;
        System.out.println(s1==s2);   //true
        Boolean b1=true;
        Boolean b2=true;
        boolean b3=false;
        System.out.println(b1==b2);   //true
        System.out.println(b1==b3);   //false
        //todo 3 buffer range is not applicable for Double & Float
        Double d1=10.0;
        Double d2=10.0;
        System.out.println(d1==d2);  //false
        //todo 4 new parameter will create new object always.
        Integer i5=new Integer(10);
        Integer i6=new Integer(10);
        System.out.println(15==16);    //false





    }
    public static void m1(Integer k){
        int m=k;   //aub
        System.out.println(k.getClass());
        System.out.println(m);

    }

}
