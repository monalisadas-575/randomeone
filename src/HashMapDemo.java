
import java.sql.SQLOutput;
import java.util.*;
class HashMapDemo{
    //i am in feature branch
    public static void main(String[] args) {
        HashMap m=new HashMap();
       m.put("Chiranjeevi",700);
        m.put("balaiah",800);
        m.put("venkatesh",200);
        m.put("nagarjuna",500);
        System.out.println(m);
        System.out.println(m.put("Chiranjeevi",1000));
        Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();
        System.out.println(s1);
        //to use iterator we are using Map.entry
        Iterator itr=s1.iterator();
        while(itr.hasNext()){
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey()+"......"+m1.getValue());
            System.out.println(m1.getKey().equals("nagarjuna"));
        }

    }
}
