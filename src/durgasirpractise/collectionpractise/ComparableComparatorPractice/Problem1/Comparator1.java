package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem1;

import java.util.Comparator;

public class Comparator1 implements Comparator {
    public int compare(Object ob1,Object ob2){
        String s1=ob1.toString();
        String s2=ob2.toString();

       // return s1.compareTo(s2);   //Todo 1 elements are alphabetical reverse order.
        return s2.compareTo(s1);
    }


}
