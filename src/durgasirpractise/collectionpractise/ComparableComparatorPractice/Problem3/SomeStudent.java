package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem3;

public class SomeStudent {
    public String getName() {
        return name;
    }

    public SomeStudent(String name) {
        this.name = name;
    }

    public SomeStudent() {
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return
                "name=" + name;

    }
}
