package durgasirpractise.collectionpractise;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class PractiseonSet {
    public static void main(String[] args) {
        HashSet hs1=new HashSet<>();
        hs1.add(23);
        hs1.add(25);
        hs1.add(20);
        hs1.add(21);
        System.out.println( hs1.add(24));    //true
        System.out.println(hs1.add(20));   //false as no duplicates are allowed
        System.out.println(hs1);       //[20, 21, 23, 24, 25]

        System.out.println("======SORTED SET========");
        SortedSet ss1=new TreeSet();
        ss1.add(100);
        ss1.add(103);
        ss1.add(104);
        ss1.add(102);
        ss1.add(105);
       // ss1.add("a");   -- Heterogeneous object will give ClassCastException
        System.out.println(ss1);    //[100, 102, 103, 104, 105]
        System.out.println(ss1.first());  //returns teh 1st element
        System.out.println(ss1.last());
        System.out.println(ss1.headSet(103));    //[100, 102]
        System.out.println(ss1.tailSet(103));   //[103, 104, 105]
        System.out.println(ss1.subSet(101,104));           //[102, 103]

        System.out.println("======TREESET======");
        TreeSet ts1=new TreeSet();
        ts1.add("A");
        ts1.add("a");
        ts1.add("Z");
        ts1.add("m");
        ts1.add("L");
       // ts1.add(null); null insertion will give NPE.
        System.out.println(ts1);    //[A, L, Z, a, m]





    }
}
