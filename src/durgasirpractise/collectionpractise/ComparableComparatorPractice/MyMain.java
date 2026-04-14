package durgasirpractise.collectionpractise.ComparableComparatorPractice;

import java.util.TreeSet;

public class MyMain {
    public static void main(String[] args) {
        TreeSet ts2=new TreeSet(new MyComparator());
        ts2.add(50);
        ts2.add(40);
        ts2.add(100);
        ts2.add(70);
        ts2.add(60);
        System.out.println(ts2);
    }
}
