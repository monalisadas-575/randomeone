package durgasirpractise.collectionpractise;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class PractiseOnArrayList {
    ArrayList al= new ArrayList(); ;
    ArrayList al2;
    //MyStudent myStudent;

    public PractiseOnArrayList() {
        this.al = new ArrayList();
        this.al2=new ArrayList(10);
        //this.myStudent= new MyStudent();
    }


    public void getArrayList() {
        for (int i = 5; i < 10; i++) {
            al.add(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("=====");
        PractiseOnArrayList pa1=new PractiseOnArrayList();
        //pa1.al.add(0,4);
        pa1.getArrayList();

        System.out.println(pa1.al);

        pa1.al2.add(0,10);
        pa1.al2.add(1,"Mona");
        pa1.al2.addAll(pa1.al);
        pa1.al2.add(7,"saumrit");
        System.out.println(pa1.al2.size());  //8


        System.out.println(pa1.al2);     //[10, Mona, 5, 6, 7, 8, 9, saumrit]
        System.out.println(pa1.al2.size());
        pa1.al2.remove("Mona");      //remove by object
        pa1.al2.remove(6);        //remove by index
        System.out.println(pa1.al2);     //[10, 5, 6, 7, 8, 9]
        pa1.al2.retainAll(pa1.al);    //only keeps the value of al collection & remove extra
        System.out.println(pa1.al2);    //[5, 6, 7, 8, 9]
        System.out.println(pa1.al2.size());     //5
        System.out.println(pa1.al2.contains("Mona"));   //false
        System.out.println(pa1.al2.get(1));    //6
        System.out.println(pa1.al2.set(0,"Mona"));//5--replace the object with specified index & return the old object
        System.out.println(pa1.al2);  //[Mona, 6, 7, 8, 9]


        Iterator it1= pa1.al2.iterator();
        while(it1.hasNext()){
            Integer in=(Integer)it1.next();
            if(in%2==0){
                System.out.println(in);
            }
            else{
                it1.remove();
            }
            System.out.println(pa1.al2);



        }




    }

}
