package durgasirpractise.JavalangPractice.ObjectMethodPractice;

public class ToStringMain {
    public static void main(String[] args) {

        Address ad1=new Address("JagatSinghpur",31,"Habeli");
        Address ad2=new Address("Cuttack",100,"jagatpur");

        //todo if we don't override toString() in our class it will call Object class toString().
        //todo Object class toString() will internally call to hashCode().

        //it will print className@Hashcode in hexadecimal form.
       // System.out.println(ad1);//durgasirpractise.JavalangPractice.ObjectMethodPractice.Address@3b07d329
        //System.out.println(ad2);//durgasirpractise.JavalangPractice.ObjectMethodPractice.Address@41629346

        System.out.println(ad1);
        System.out.println(ad2);

        Address ad3=new Address("puri",23,"jagannath temple");
        Address ad4=new Address("puri",23,"jagannath temple");
        System.out.println(ad3.equals(ad4));
        System.out.println(ad3.roadNo== ad4.roadNo);
        
    }
}
