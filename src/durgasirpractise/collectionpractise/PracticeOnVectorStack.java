package durgasirpractise.collectionpractise;

import java.util.Enumeration;
import java.util.Vector;

public class PracticeOnVectorStack {
    Vector v1=new Vector<>();

    public static void main(String[] args) {
        PracticeOnVectorStack pv1=new PracticeOnVectorStack();
        pv1.v1.add(2);
        pv1.v1.add(3);
        pv1.v1.add(4);
        pv1.v1.add(5);
        pv1.v1.add(6);
        pv1.v1.add(7);
        pv1.v1.add(8);
        pv1.v1.add(9);
        pv1.v1.add(10);
        System.out.println((pv1.v1));   //[2, 3, 4]
        System.out.println(pv1.v1.capacity());   // 10
       // pv1.v1.clear();
       // System.out.println(pv1.v1);          //[]
        // todo enumeration
        Enumeration e1=pv1.v1.elements();
        while(e1.hasMoreElements()){
            Integer i1=(Integer)e1.nextElement();
            if(i1%2==0) {
                System.out.println(i1);
                pv1.v1.remove(i1);  //It removes all Integer which is divided by 2
            }
        }
        System.out.println(pv1.v1);   //[3, 5, 7, 9]

    }
}
