package durgasirpractise.collectionpractise.Problem6;
import java.util.*;

public class PracticeOnIterator {
    public static void main(String[] args) {
        Map<String,Integer> practice1=new HashMap<>();
        practice1.put("Onion",130);
        practice1.put("Potato",50);
        practice1.put("DryFruits",500);
        practice1.put("Mustard Oil",250);

        Iterator<Map.Entry<String,Integer>> it1= practice1.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry<String,Integer> entries=it1.next();
            if(entries.getKey()=="Mustard Oil"){
                entries.setValue(350);
            }
            System.out.println(entries);
        }

        List<Address> houseList= new LinkedList<>();
        Address ad11=new Address("Cuttack","jagatpur-Lane1");
        Address ad2=new Address("Cuttack","jagatpur-Lane2");
        Address ad3=new Address("Cuttack","ImamNagar");
        Address ad4=new Address("Bhubaneswar","Patia");
        houseList.add(ad11);
        houseList.add(ad2);
        houseList.add(ad3);
        houseList.add(ad4);
        System.out.println(houseList);

        ListIterator<Address> it2= houseList.listIterator();
        while(it2.hasNext()){
            Address ad100=it2.next();
            if (ad100.getDist().equals("Bhubaneswar")){
                ad100.setDist("Cuttack");
            }
            System.out.println(ad100);
        }


    }
}
