package durgasirpractise.collectionpractise.Problem5;

import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        Address address1=new Address("Cuttack","Nachhipur");
        Address address3=new Address("Khordha","Khordha-Lane1");
        Address address4=new Address("Khordha","Khordha-Lane3");
        Address address2=new Address("Berhampur","Road-2");
        Address address5=new Address("Berhampur","Road-3");
        Address address6=new Address("Berhampur","Road-5");
        List<Address> ad1=new ArrayList<>();
        ad1.add(address1);
        ad1.add(address3);
        ad1.add(address4);
        List<Address> ad2=new ArrayList<>();
        ad2.add(address2);
        ad2.add(address5);
        ad2.add(address6);

        EngineeringCollege college1=new EngineeringCollege();
        EngineeringCollege college2=new EngineeringCollege();

        List<String> l1=new ArrayList<>();
        l1.add("Computer");l1.add("Mechanical");l1.add("Civil");l1.add("+2");
        List<String> l2=new ArrayList<>();
        l2.add("Computer");l2.add("Mechanical");l2.add("EEE");
        Set<String> s1=new HashSet<>();
        s1.add("Wipro");
        s1.add("TCS");
        s1.add("Careloon");
        Set<String> s2=new HashSet<>();
        s2.add("Sm Consultant");
        s2.add("Wsp");
        s2.add("Z Estate");
        college1.setName("KMBB");
        college1.setDepartment(l1);
        college1.setHeadOffice(address3);
        college1.setCampusCompanies(s1);
        //college1.setAllHostels(ad1);

        college2.setName("Berhampur Govt. College");
        college2.setDepartment(l2);
        college2.setHeadOffice(address2);
        college2.setCampusCompanies(s2);
        //college2.setAllHostels(ad2);
        s2.add("tuntun.pvt.ltd");

        System.out.println(college1.getDepartment());
        System.out.println(college2.getCampusCompanies());
        college2.addCampusCompanies("Hululu company");
        System.out.println(college2.getCampusCompanies());
        college2.getCampusCompanies().add("gyufyufyuf");

        Map<String,Address> m1= new HashMap<>();
        m1.put("Hostel1",address1);
        m1.put("Hostel2",address1);
        college1.getAllHostels().putAll(m1);
        college2.getAllHostels().putAll(m1);

        college2.updateSingleHostel("Hostel1",address2);





    }
}
