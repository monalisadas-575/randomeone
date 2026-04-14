package durgasirpractise.collectionpractise.Problem6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMainSociety {
    public static void main(String[] args) {
        Address ad1=new Address("Cuttack","jagatpur-Lane1");
        Address ad2=new Address("Cuttack","jagatpur-Lane2");
        Address ad3=new Address("Cuttack","ImamNagar");
        Address ad4=new Address("Bhubaneswar","Patia");
        Society sc1=new Society();

        Map<Integer,String> m1=new TreeMap<>();
        m1.put(101,"Mr.Pati");
        m1.put(102,"Mr.Telgu");
        m1.put(103,"Mr.Nayak");
        m1.put(104,"Mr.Santan");

        Map<String,Address> m11=new HashMap<>();
        m11.put("Sai Residency",ad1);
        m11.put("SadaShiva Residency",ad2);
        m11.put("Parvati Residency",ad3);
        m11.put("Damini Residency",ad4);


        sc1.setSocietyName("Sai Residency");
        sc1.setAddress(ad1);
        sc1.setHouseNo(100);
        sc1.setOwnerName("Santan Behera");
        sc1.setAllSociety(m11);
        sc1.setTotalHouseList(m1);
        //System.out.println(sc1);

        sc1.updateHouseList(103,"Mr. Telgu");
        sc1.updateHouseList(105,"Mr. Pani");
        sc1.updateSocietyName("Behera Residency");
        System.out.println(sc1.getSocietyName());
        ;
       // System.out.println(sc1);

    }

}
