package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem4;

import java.util.Comparator;

public class ImplementComparator implements Comparator {
    @Override
    public int  compare(Object o1, Object o2) {
        EnggStudent es3 = (EnggStudent) o1;
        EnggStudent es4 = (EnggStudent) o2;
        return (es3.getStudentGrade()-es4.getStudentGrade());
    }
}
