package durgasirpractise.JavalangPractice;

public class StringPractice {

    String s1=new String("Monalisa");
    String s2=new String("Monalisa");
    //todo here 2 object got created one in heap area & another in SCP. s2 pointing towards heap area.


    String s3="Saumrit";
    //todo here 1 objcet will be created in SCP. s3 is always pointing towards that only(SCP).
    String s4="Saumrit";
    //todo as the object is already available in SCP area with reqd. content then existing object will be reused.
    char[] ch1={'a','b','c','d'};
    String s5=new String(ch1);
    //todo it craete equivalent string object for the char array.
    byte[] b1={100,101,102,103};
    String s6=new String(b1);


    public static void main(String[] args) {
        StringPractice sp1=new StringPractice();
        sp1.s1.concat("Das");
        //todo once we craete String we cant perform any changes called immutability
        System.out.println("1 "+sp1.s1);  //--Monalisa

        //todo in the below statement it only print the value after concation but still s2 object value is "Monalisa" only.
        System.out.println("2 "+sp1.s2.concat("Das"));    //---MonalisaDas
        System.out.println("3 "+sp1.s2);                     //--Monalisa

        //todo here as I am trying to perform changes new s2 got created.
        sp1.s2="Monalisa Behera";
        System.out.println("4 "+sp1.s2);

        //todo even though we created two different object s1,s2 but .equals() is overridden for content comparison
        System.out.println(sp1.s1.equals(sp1.s2));   //---true

        //todo as s3 contain same content that will be use in SCP area.Both S3 & s4 pointing towards same object.
        System.out.println(sp1.s3.equals(sp1.s4));  //--true

        //todo  s5 & s6 both are string array.
        System.out.println(sp1.s5.getClass().getName());      //--java.lang.String

        //todo it creates equivalent string object for the byte array.
        System.out.println(sp1.s6);     //defg

        String s10=new String("deepa");
        String s11=s10.toUpperCase();
        String s12=s10.toLowerCase();
        System.out.println(s11);    //DEEPa
        System.out.println(s12);     //deepa
        System.out.println(s10==s11);    //false
        System.out.println(s10==s12);    //true



    }
}
