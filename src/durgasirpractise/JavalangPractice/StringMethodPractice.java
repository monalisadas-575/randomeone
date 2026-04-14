package durgasirpractise.JavalangPractice;

public class StringMethodPractice {
     String s3="behera";


    public static void main(String[] args) {
        StringMethodPractice sm1=new StringMethodPractice();

        StringPractice sp2=new StringPractice();
        //todo 1 concat method(it also uses +/+= )
        System.out.println(sp2.s1.concat(" Das"));

        //todo 2 charAt(int index)
        sp2.s1="Behera";
        System.out.println(sp2.s1.charAt(1));  //e

        //todo 3 equals(oject o)-this is overriding version of object class
        System.out.println(sp2.s5.equals(sp2.s6));   //false

        //todo 4 to perform comparision where case is not important.
        System.out.println(sp2.s1.equalsIgnoreCase(sm1.s3));   //true
        System.out.println(sp2.s1.equalsIgnoreCase("BEHERA"));   //true

        //todo 5 print beginning index to end of String
        System.out.println(sp2.s1.substring(2));   //hera
        //todo 6 print begining index to end-1
        System.out.println(sp2.s1.substring(2,5));      //her

        //todo 7 length variable applicable for arrays but length() applicable for String objects.
        System.out.println(sp2.s3.length());      //7
        //todo 8 replace method
        System.out.println(sp2.s1.replace('B','k'));  //kehera
        //todo 9& 10 toLowerCase()
        sp2.s6="Monalisa Das Behera";
        sp2.s5="  Monalisa Das  ";
        System.out.println(sp2.s1.toLowerCase());  //behera
        System.out.println(sp2.s1.toUpperCase());  //BEHERA
        //todo 11 remove blank spaces at the begining & end of the string but not the middle blank spaces.
        System.out.println(sp2.s6.trim());        //Monalisa Das Behera
        System.out.println(sp2.s5.trim());        //Monalisa Das
        //todo 12 & 13 returns first occurrence & last occurrence of specified character.
        System.out.println(sp2.s6.indexOf('a'));   //3
        System.out.println(sp2.s6.lastIndexOf('a'));   //18





    }
}
