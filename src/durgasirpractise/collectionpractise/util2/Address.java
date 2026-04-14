package durgasirpractise.collectionpractise.util2;

public class Address {
    String city;
    String lane1;
    String lane2;

    public Address() {
    }

    public Address(String city) {
        this.city = city;
    }

    public Address(String city, String lane1, String lane2) {
        this.city = city;
        this.lane1 = lane1;
        this.lane2 = lane2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLane1() {
        return lane1;
    }

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    public String getLane2() {
        return lane2;
    }

    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    @Override
    public String toString() {
        return "Address{" + city + ',' +
                lane1 +','+ lane2 +'}';

    }
}
