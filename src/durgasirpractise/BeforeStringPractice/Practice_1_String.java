package durgasirpractise.BeforeStringPractice;

/*
class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public String toString(){
        return name+"..."+rollno;
    }

}
    public class Practice_1_String {
        public static void main(String[] args) {
            Student s1 = new Student("Durga", 101);
            Student s2 = new Student("Ravi", 102);
            System.out.println(s1);
            System.out.println(s1.toString());
            System.out.println(s2);
        }

    }*/

import java.util.ArrayList;

class Test{
    Integer i;

    public Test(Integer i) {
        this.i = i;
    }
    public String toString(){
        return "test";
    }

    public static void main(String[] args) {

        String s=new String("durga");
        System.out.println(s);
       // Integer i = new Integer(10);
       // System.out.println(i);
        ArrayList l=new ArrayList();
        l.add("A");
        l.add("B");
        System.out.println(l);
       // Test t=new Test(i);
       // System.out.println(t);
       // System.out.println(t.i);

    }
}

