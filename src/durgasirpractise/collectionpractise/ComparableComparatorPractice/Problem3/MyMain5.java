package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem3;

import java.util.*;

public class MyMain5 {

    private static  void print(int n){
        if(n==0)
            System.out.println("Both Fruits are of same price");
        else if(n>0)
            System.out.println("First fruit is costlier");
        else if(n<0)
            System.out.println("Second fruit is costlier");
    }

    public static void main(String[] args) {
        Fruits f1= new Fruits("kashmiri-apple",300);
        f1.setMfdate(new Date(2025,12,13));

        Fruits f2=new Fruits("Tirtol-apple",500);
        f2.setMfdate(new Date(2025,12,14));

        Fruits f3=new Fruits("jagatpur-apple",100);
        f3.setMfdate(new Date(2025,12,15));

        Fruits f4=new Fruits("Chandikhol-apple",300);
        f4.setMfdate(new Date(2025,12,16));

        print(f1.compareTo(f1));
        print(f1.compareTo(f2));
        print(f1.compareTo(f3));
        print(f1.compareTo(f4));
        System.out.println("===========================");


        print(f2.compareTo(f1));
        print(f2.compareTo(f2));
        print(f2.compareTo(f3));
        print(f2.compareTo(f4));
        System.out.println("===========================");

        Set<Fruits> s1= new TreeSet<>();
        ;;;;
        System.out.println(s1.add(f1));
        System.out.println(s1.add(f2));
        System.out.println(s1.add(f3));
        System.out.println(s1.add(f4));

        Iterator<Fruits> it1= s1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }


        System.out.println("===========================");
        Comparator<Fruits> comparator= new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Fruits f1= (Fruits) o1;
                Fruits f2= (Fruits) o2;
                if(f1.getMfdate().before(f2.getMfdate()))
                    return 1;
                else if(f1.getMfdate().after(f2.getMfdate()))
                    return -1;
                else return 0;
            }
        };
        Set<Fruits> s2= new TreeSet<>(comparator);
        ;;;;
        System.out.println(s2.add(f1));
        System.out.println(s2.add(f2));
        System.out.println(s2.add(f3));
        System.out.println(s2.add(f4));

        Iterator<Fruits> it2= s2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
