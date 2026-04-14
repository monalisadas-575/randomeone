package durgasirpractise.JavalangPractice.ObjectMethodPractice;

public class Name1 {
    String name;

//    public Name1(String name) {
//        this.name = name;
//    }
public static void main(String[] args) {

    Name1 s2 = new Name1();
    s2.name="Monalisa";

    System.out.println(s2.name);System.out.println(s2.name.hashCode());System.out.println(s2.hashCode());
    s2.name="Saumrit";
    System.out.println("===================");
    //todo name hashcode() will change not s2 object hashcode.
    // at first s2. name was pointing towards "Monalisa" String constant but later "saumrit" String constant.
    System.out.println(s2.name);System.out.println(s2.name.hashCode());System.out.println(s2.hashCode());

    String s3= "Monalisa";
    System.out.println(s3.hashCode());
    //todo when S3 object created with "Monalisa" String constant so JVM gives the same String Constant hashcode to s3
    System.out.println();
    String s4= new String("Monalisa");
    System.out.println(s4.hashCode());


    }
}