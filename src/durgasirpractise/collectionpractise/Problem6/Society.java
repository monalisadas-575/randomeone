package durgasirpractise.collectionpractise.Problem6;

import java.util.Map;

public class Society {
    private String societyName;
    private Address address;
    private String ownerName;
    private int houseNo;
    private Map<Integer,String> totalHouseList;
    private Map<String,Address> allSociety;

    public Society() {
    }

    public Society(String societyName, Address address, String ownerName, int houseNo,
                   Map<Integer, String> totalHouseList, Map<String, Address> allSociety) {
        this.societyName = societyName;
        this.address = address;
        this.ownerName = ownerName;
        this.houseNo = houseNo;
        this.totalHouseList = totalHouseList;
        this.allSociety = allSociety;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public Map<Integer, String> getTotalHouseList() {
        return totalHouseList;
    }

    public void setTotalHouseList(Map<Integer, String> totalHouseList) {
        this.totalHouseList = totalHouseList;
    }

    public Map<String, Address> getAllSociety() {
        return allSociety;
    }

    public void setAllSociety(Map<String, Address> allSociety) {
        this.allSociety = allSociety;
    }
    public void updateHouseList(Integer newHouse,String newOwner){
        this.getTotalHouseList().put(newHouse,newOwner);
    }
    public void addSocietyName(String newSociety){
        this.setSocietyName(newSociety);
    }
    public void updateSocietyName(String society){
        this.setSocietyName(society);
    }
    public void deleteSocietyName(){
        this.setSocietyName(null);
    }

    @Override
    public String toString() {
        return "Society{" +
                "societyName='" + societyName + '\'' +
                ", address=" + address +
                ", ownerName='" + ownerName + '\'' +
                ", houseNo=" + houseNo +
                ", totalHouseList=" + totalHouseList +
                ", allSociety=" + allSociety +
                '}';
    }
}
