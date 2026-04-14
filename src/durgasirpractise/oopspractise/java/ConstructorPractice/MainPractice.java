package durgasirpractise.oopspractise.java.ConstructorPractice;
import durgasirpractise.oopspractise.java.ConstructorPractice.child.ConstructorChild;

public class MainPractice extends ConstructorParent{
    String babyName;

    public MainPractice(){

    }
    public MainPractice(String name, String birthPlace, String babyName) {
        super(name, birthPlace);
        this.babyName = babyName;
    }

    @Override
    public String toString() {
        return "MainPractice{" +
                "babyName='" + babyName + '\'' +
                ", ParentName='" + ParentName + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConstructorChild cp1=new ConstructorChild("Monalisa","Tuni");
        System.out.println(cp1);
        MainPractice mp1=new MainPractice("Tuni","Tirtol","Monalisa");
        System.out.println(mp1);
    }

}
