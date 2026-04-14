package harrypractise.advancedJava;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
//import java.util.Date;
//ArrayList
/*
public class concept_on_java {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        System.out.println(l1);
        //l1.clear();-->Removes element from the list
        l1.addAll(l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,156);
        for(int i=0;i<l1.size();i++) {
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}*/




//LinkedList
/*
public class concept_on_java {
    public static void main(String[] args) {
        LinkedList<Integer>l1=new LinkedList<>();
        //LinkedList<Integer>l2=new LinkedList<>(5);--> initial capacity is not present in the linkedList.
        LinkedList<Integer>l2=new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        System.out.println(l1);
        //l1.clear();-->Removes element from the list
        l1.addAll(l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,156);
        l1.addLast(500);//-->addLast- append specified element to the end of list.
        l1.addFirst(100);//-->addFirst- append specified element to the first of list.
        for(int i=0;i<l1.size();i++) {
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}*/




//array Deque(double entry queue
/*
public class concept_on_java {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.offerFirst(1);
        ad1.addFirst(2);
        ad1.offerLast(3);
        ad1.addLast(4);
        System.out.println("Deque after insert :"+ad1);
        //examine element using get and peek method
        System.out.println("first element using get: "+ad1.getFirst());
        System.out.println("first element using peek: "+ad1.peekFirst());
        System.out.println("last element using get: "+ad1.getLast());
        System.out.println("last element using peek: "+ad1.peekLast());
        //Remove elements from both ends
        System.out.println("Removed first using remove: "+ad1.removeFirst());
        System.out.println("Removed first using poll: "+ad1.pollFirst());
        System.out.println("Removed last using remove: "+ad1.removeLast());
        System.out.println("Removed last using poll: "+ad1.pollLast());
        System.out.println("Deque after removal: "+ad1);
    }
}*/



//Store date in java
/*
public class concept_on_java {
    public static void main(String[] args){
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d=new Date();
        System.out.println(d);
    }
}*/





// Calendar class in java
public class concept_on_java {
    public static void main(String[] args) {
        /*
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        Calendar d=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore") ) ;
        System.out.println(d.getCalendarType());
        System.out.println(d.getTime());
        System.out.println(d.getTimeZone().getID());

         */




    //Calendar class methods(Old, Jdk 1.1)

    /*Calendar d= Calendar.getInstance();
        System.out.println(" Second"  + d.get(Calendar.SECOND));
        System.out.println(" Minute" +d.get(Calendar.MINUTE));
        System.out.println(" Date" +d.get(Calendar.DATE));
        System.out.println(" Year" +d.get(Calendar.YEAR));


     */


        //Java.time API(Modern, Java 8)

                LocalDate today = LocalDate.now();
                System.out.println("Today's Date: " + today);

                LocalDate birthday = LocalDate.of(1998, 5, 10);
                System.out.println("Birthday: " + birthday);

                LocalDate future = today.plusDays(10);
                System.out.println("After 10 days: " + future);

                LocalTime nowTime = LocalTime.now();
                System.out.println("Current Time: " + nowTime);

                LocalDateTime dateTime = LocalDateTime.now();
                System.out.println("Current DateTime: " + dateTime);

                Period age = Period.between(birthday, today);
                System.out.println("Age: " + age.getYears() + " years " + age.getMonths() + " months");





                //Java.time package(Date Time Formatter)
        


            }
        }

