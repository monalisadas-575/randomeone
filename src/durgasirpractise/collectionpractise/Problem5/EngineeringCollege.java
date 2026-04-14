package durgasirpractise.collectionpractise.Problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EngineeringCollege {
    private String name;
    private Address headOffice;
    private List<String> department;
    private Set<String> campusCompanies;
    private Map<String,Address> allHostels;


    public EngineeringCollege() {
    }

    public EngineeringCollege(String name, Address headOffice, List<String> department, Set<String> campusCompanies, Map<String,Address>  allHostels) {
        this.name = name;
        this.headOffice = headOffice;
        this.department = department;
        this.campusCompanies = campusCompanies;
        this.allHostels = allHostels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(Address headOffice) {
        this.headOffice = headOffice;
    }

    public List<String> getDepartment() {
        return department;
    }

    public void setDepartment(List<String> department) {
        this.department = department;
    }

    public Set<String> getCampusCompanies() {
        return campusCompanies;
    }

    public void setCampusCompanies(Set<String> campusCompanies) {
        this.campusCompanies = campusCompanies;
    }

    public Map<String,Address> getAllHostels() {
        return allHostels;
    }

    public void setAllHostels(Map<String,Address> allHostels) {
        this.allHostels = allHostels;
    }

    public void addCampusCompanies(String newCompany){
        //sanitize newCompany
        this.getCampusCompanies().add(newCompany);
    }

    public void removeCampusCompanies(String newCompany){
        //sanitize newCompany
        this.getCampusCompanies().remove(newCompany);
    }
    public void updateSingleHostel(String hostelName,Address newAddress){
        //Snaitize the newHostel

        this.getAllHostels().put(hostelName,newAddress);

    }

    @Override
    public String toString() {
        return "EngineeringCollege{" +
                "name='" + getName() + '\'' +
                ", headOffice=" + headOffice +
                ", department=" + getDepartment() +
                ", campusCompanies=" + campusCompanies +
                ", allHostels=" + allHostels +
                '}';
    }
}
