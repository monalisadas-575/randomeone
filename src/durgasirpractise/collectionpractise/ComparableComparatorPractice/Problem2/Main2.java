package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem2;

import java.util.*;
//write a program to insert string & string Buffer objects inti treeSet where sorting order is
//increasing length order.If 2 objects having same length then consider their alphabetical order.

public class Main2 {
    public static void main(String[] args) {
        TreeSet ts2=new TreeSet<>(new Comparator2());
        ts2.add("Mona");
        ts2.add("Saumrit");
        ts2.add("Tu");
        ts2.add("Saumrit Lal");
        ts2.add("Mama");
        ts2.add(new StringBuffer("raja"));
        System.out.println(ts2);
    }
}
