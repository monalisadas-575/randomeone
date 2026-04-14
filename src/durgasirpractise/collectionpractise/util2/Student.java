package durgasirpractise.collectionpractise.util2;

import java.util.ArrayList;

public class Student {

    //Student class(field name , age, Address class(String city, string Lane1, String lan2)
    // Parents class(field fathers name, mothers Name) inside student class
    //list inside student class add 2 object.
    String name;
    int age;
    Address address;
    Parent parent;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Address address, String name, int age, Parent parent) {
        this.address = address;
        this.name = name;
        this.age = age;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Student{" + name +',' + age +
                ',' + address +
                ','+ parent +
                '}';
    }

    public static void main(String[] args) {
        Parent p1=new Parent("Lokanath","Tuni");
        Parent p2=new Parent("Sanatan","Mita");
        Address ad1=new Address("Tirtol","Posal","Habeli");
        Address ad2=new Address("Cuttack","jagatpur","Imamnagar");
        Student s1=new Student("Monalisa",28);
        Student s2=new Student("saumrit",31);
        Student s3=new Student(ad1,s1.name, s1.age, p1);
        Student s4=new Student(ad2,s2.name,s2.age,p2);
        System.out.println(s3);
        System.out.println(s4);
        ArrayList<Student>al1=new ArrayList<>();
        al1.add(s1);
        al1.add(s2);
        al1.add(s3);
        al1.add(s4);
        System.out.println(al1);




    }
}
