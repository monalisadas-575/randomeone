package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem1;

import java.util.Comparator;
import java.util.TreeSet;

//Todo 1 elements are alphabetical reverse order.
public class Main  {
    public static void main(String[] args) {
        TreeSet ts1=new TreeSet<>(new Comparator1() );
        ts1.add("Mona");
        ts1.add("Saumrit");
        ts1.add("Raja");
        ts1.add("Mama");
        ts1.add("tuntun");
        System.out.println(ts1);     //[Mama, Mona, Raja, Saumrit, tuntun]
        // after adding return s2.compareTo(s1); ans -[tuntun, Saumrit, Raja, Mona, Mama]



    }
}
