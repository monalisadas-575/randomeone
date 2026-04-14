package durgasirpractise.collectionpractise.Problem6;

public class Address {
    private String dist;
    private String area;

    public Address() {
    }

    public Address(String dist, String area) {
        this.dist = dist;
        this.area = area;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "dist='" + dist + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
