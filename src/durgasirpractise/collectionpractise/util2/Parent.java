package durgasirpractise.collectionpractise.util2;

public class Parent {
    private String motherName;
    private String fatherName;

    public Parent(){

    }
    public Parent(String fatherName,String motherName){
        this.fatherName=fatherName;
        this.motherName=motherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public String getFatherName(){
        return fatherName;
    }
    public void setFatherName(){
        this.motherName=motherName;
    }

    @Override
    public String toString() {
        return "Parent{ " + motherName  +","+
                  fatherName  +
                '}';
    }
}
