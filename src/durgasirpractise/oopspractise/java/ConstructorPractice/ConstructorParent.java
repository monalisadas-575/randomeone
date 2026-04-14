package durgasirpractise.oopspractise.java.ConstructorPractice;

/**
 * abstract class can contain constructor though it won't create object becoz
 when some other class will extends abstract class, its constructor will call super class constructor.So
 abstract class contain constructor.
 *
 */
 public abstract  class ConstructorParent {
     String ParentName;
     String birthPlace;
     int age;


     /**
      *  1 if we don't write constructor then compiler will place
      * access modifier of default constructor same as access modifier of class
      * if we write constructor then we have to explicitly mention modifier of constructor
      * otherwise compiler will consider it as default(only package level access).
      * If we want to access it outside the package then we have to writ it protected/ public .
      */

     public ConstructorParent(){
        System.out.println("Default No-arg constructor");
     }
     protected ConstructorParent(String ParentName){
         this.ParentName=ParentName;
         System.out.println("Parent class protected constructor");
     }

     /**
      * @param name
      * @param birthPlace
      */
      ConstructorParent(String name,String birthPlace){   //Compiler treat it as a default constructor
         this.ParentName=name;
         this.birthPlace=birthPlace;
         //System.out.println("Default 2 arg constructor of parent type");
     }

     //Todo 3 constructor dont have return type. if we write return type then compiler will consider it as a method.


    @Override
    public String toString() {
        return "ConstructorParent{" +
                "ParentName='" + ParentName + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", age=" + age +
                '}';
    }
}
