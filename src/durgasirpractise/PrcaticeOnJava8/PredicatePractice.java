package durgasirpractise.PrcaticeOnJava8;
import java.util.function.Predicate;
import durgasirpractise.fundametalpractise.util1.Student;

public class PredicatePractice {
    public static void main(String[] args) {
        Predicate<Integer> pi=i-> i%2==0;
        System.out.println(pi.test(10));
        System.out.println(pi.test(15));

        //todo 1 use of pedicate in array of string where print only the string which is having length more than 5
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        String[] s1={"Mona","Monalisa","lal","saumritLal","Sobha","sandeep"};
        Predicate<String> p=s2->s2.length()>5;
        Predicate<String> p1=s2->s2.length()%2==0;
        for(String element:s1){
            //todo below we use only 1 predicate
//            if(p.test(element)){
//                System.out.println("printing the String which are >5 :"+element);
//            }
            //todo below we can use 2 predicate and ,or, negate
//            if(p.and(p1).test(element)){
//                System.out.println("printing the String which are >5 & even :"+element);
//            }
            if(p.negate().test(element)){
                System.out.println("printing the String which are < 5 :"+element);
            }
        }
    }
}
