package durgasirpractise.collectionpractise;
import durgasirpractise.JavalangPractice.ObjectMethodPractice.HashCodePractice.Student;

import java.util.*;

import java.util.LinkedList;

public class PractiseOnLinkedList {
    public static void main(String[] args){
        PractiseOnArrayList pa2=new PractiseOnArrayList();
        PractiseOnLinkedList pl1=new PractiseOnLinkedList();
        LinkedList ll1=new LinkedList();


        ll1.add("Mona");
        ll1.add(1,"saumrit");
        pa2.getArrayList();
        ll1.addAll(pa2.al);
        System.out.println(ll1);   //[Mona, saumrit, 5, 6, 7, 8, 9]
        ll1.addFirst("Tuntun");
        ll1.addLast(10);
        System.out.println(ll1.getFirst());   //Tuntun
        System.out.println(ll1.size());      //9

//        ListIterator lt1= ll1.listIterator();
//        while(lt1.hasNext()){
//            Object a=lt1.next();
//            System.out.println(a);
//            if(a.getClass().isInstance(String))
//        }






    }
}
