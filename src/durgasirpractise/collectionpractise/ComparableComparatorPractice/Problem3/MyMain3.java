package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MyMain3 {
    public static void main(String[] args) {
        Collection<SomeStudent> c1=new ArrayList<>();
        Collection<SomeStudent> c2=new LinkedList<>();

        System.out.println(c1.remove(new SomeStudent("ram")));
        c1.add(new SomeStudent("ram"));
        System.out.println("===================");
        System.out.println("===================");
        System.out.println("===================");
        //todo read about java 8 lambda
//        System.out.println(c1.removeIf(
//                bbbb->bbbb.getName().equalsIgnoreCase("ram")
//        ));
        c1.add(new SomeStudent("Sham"));
        c1.add(new SomeStudent("Geeta"));
        c1.add(new SomeStudent("Hari"));
        c1.add(new SomeStudent("Nalua"));
        Iterator<SomeStudent> it1= c1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("===================");
        for(SomeStudent someStudent: c1){
            System.out.println(someStudent);
        }
        System.out.println("===================");
        //remove Hari

        System.out.println("=======REMOVE============");
        Iterator<SomeStudent> it2= c1.iterator();
        while(it2.hasNext()){
            //System.out.println(it2.next());
            SomeStudent s1=it2.next();
            if(s1.getName().equalsIgnoreCase("Hari")){
                it2.remove();
            }
            //System.out.println(it2.next());
        }

        Iterator<SomeStudent> it3= c1.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }

    }
}
