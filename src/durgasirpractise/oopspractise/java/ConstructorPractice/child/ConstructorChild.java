package durgasirpractise.oopspractise.java.ConstructorPractice.child;

import durgasirpractise.oopspractise.java.ConstructorPractice.ConstructorParent;

public class ConstructorChild extends ConstructorParent {
    String motherName;


    public ConstructorChild(String ParentName,String motherName) {
        super(ParentName);
        this.motherName=motherName;

    }
    protected ConstructorChild(){
        super();

    }
    public ConstructorChild(String motherName){
        super();
        this.motherName=motherName;
    }

    @Override
    public String toString() {
        return "ConstructorChild{" +
                "motherName='" + motherName + '\'' +
                '}';
    }
}
