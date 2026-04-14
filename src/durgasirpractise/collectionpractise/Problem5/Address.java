package durgasirpractise.collectionpractise.Problem5;

public class Address {
      String dist;
     private String buildNo;

    public Address() {
    }

    public Address(String dist, String buildNo) {
        this.dist = dist;
        this.buildNo = buildNo;
    }
    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "dist='" + dist + '\'' +
                ", buildNo='" + buildNo + '\'' +
                '}';
    }
}
