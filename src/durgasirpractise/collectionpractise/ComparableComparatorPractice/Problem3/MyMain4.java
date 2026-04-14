package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem3;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyMain4 {

    public static void main(String[] args) {
        //Create linked-list of String with 10 elelemts
        //two element will have "banana" ane one will have "apple" as value
        //print the values of list
        //remove all banana and apple from the list
        //print the remaining values of list

        LinkedList<Fruits> lf1=new LinkedList<>();
        lf1.add(new Fruits("berries"));
        lf1.add(new Fruits("apple"));
        lf1.add(new Fruits("banana"));
        lf1.add(new Fruits("apple"));
        lf1.add(new Fruits("papaya"));
        lf1.add(new Fruits("grapes"));
        lf1.add(new Fruits("coconut"));
        lf1.add(new Fruits("strawberry"));
        lf1.add(new Fruits("banana"));
        lf1.add(new Fruits("apple"));
        System.out.println("list before remove"+lf1);

        ListIterator<Fruits> lt1= lf1.listIterator();
        while(lt1.hasNext()){
            Fruits f1=lt1.next();
            if(f1.getName().equalsIgnoreCase("apple")){
                lt1.remove();
            }
            if(f1.getName().equalsIgnoreCase("banana")){
                lt1.remove();
            }
        }
        System.out.println("Printing after removal");
       ListIterator<Fruits> lt2= lf1.listIterator();
        while(lt2.hasNext()){
            System.out.println(lt2.next());
        }





    }
}
