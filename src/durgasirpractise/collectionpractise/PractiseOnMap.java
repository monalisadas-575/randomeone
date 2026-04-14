package durgasirpractise.collectionpractise;

import java.util.*;

public class  PractiseOnMap {

    public static void main(String[] args) {
        Map<String,Integer> theMap= new HashMap<>();
        theMap.put("potato",10);
        theMap.put("cabbage",18);
        theMap.put("tomato",10);
        theMap.put("capsicum",60);
        theMap.put("papaya",50);

        System.out.println(theMap);
        Iterator<Map.Entry<String,Integer>> li=  theMap.entrySet().iterator();
        while(li.hasNext()){
            Map.Entry<String,Integer> theEntry=li.next();
            System.out.println("key is: "+theEntry.getKey()+
                    " &  value is: "+theEntry.getValue());
            System.out.println("====================");
        }
    }
}
