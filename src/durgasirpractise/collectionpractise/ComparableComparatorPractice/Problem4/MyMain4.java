package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem4;

import java.util.Comparator;
import java.util.TreeSet;

public class MyMain4 {
    public static void main(String[] args) {
        TreeSet<EnggStudent> ts1=new TreeSet<>(new Comparator<EnggStudent>() {
            @Override
            public int compare(EnggStudent o1, EnggStudent o2) {
                EnggStudent es3 = (EnggStudent) o1;
                EnggStudent es4 = (EnggStudent) o2; //TODO here o1 was there instead of o2, so programme ws failing
                if (es3.getStudentGrade() > es4.getStudentGrade()) {
                    return 1;
                }
                if (es3.getStudentGrade() < es4.getStudentGrade()) {
                    return -1;
                }
                return 0;
            }
        });
        EnggStudent saumrit=new EnggStudent(23,'O');
        EnggStudent satya=new EnggStudent(21,'A');
        EnggStudent surya=new EnggStudent(20,'B');
        EnggStudent sapan=new EnggStudent(24,'C');
        EnggStudent sandeep=new EnggStudent(25,'D');
        ts1.add(saumrit);
        ts1.add(satya);
        ts1.add(surya);
        ts1.add(sapan);
        ts1.add(sandeep);
        System.out.println(ts1);

        System.out.println("============");

        TreeSet<EnggStudent> ts2=new TreeSet(new ImplementComparator());
        ts2.add(saumrit);
        ts2.add(satya);
        ts2.add(surya);
        ts2.add(sapan);
        ts2.add(sandeep);
        System.out.println(ts2);
    }


}
