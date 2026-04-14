package durgasirpractise.JavalangPractice.ObjectMethodPractice.HashCodePractice;

public class Student {
    int id;
    String name;
    int rollNo;
    Student(){

    }
    public Student(int id,  int rollNo) {
        this.id = id;
        this.rollNo = rollNo;
    }
    //As we override hashCode() object class HashCode() wont be called.
    //todo we can change object representation by returning id, rollNo
    @Override
    public int hashCode(){
        return id+ rollNo;

    }


}
