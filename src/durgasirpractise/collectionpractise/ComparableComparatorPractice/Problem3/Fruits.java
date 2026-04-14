package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem3;

import java.util.Date;

public class Fruits implements Comparable {
    private String name;
    private int price;
    private Date mfdate;

    public Fruits() {
    }

    public Fruits(String name) {
        this.name = name;
    }

    public Fruits(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getMfdate() {
        return mfdate;
    }

    public void setMfdate(Date mfdate) {
        this.mfdate = mfdate;
    }

    @Override
    public String toString() {
        return
                "name= " + name+" & price= "+ price+ " & date is "+getMfdate().getDate();
    }

    @Override
    public int compareTo(Object o) {
        Fruits f2=(Fruits) o;

        return this.getPrice()-f2.getPrice();
    }
}
