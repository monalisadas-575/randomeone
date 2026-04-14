package durgasirpractise.fundametalpractise.util1;

import java.util.ArrayList;

public class IdentifyPersonProfessor {
    public static void main(String[] args) {
        ArrayList<Person> pList=new ArrayList<>();
        pList.add(new Professor("Roninson",123));
        pList.add(new Student("Monalisa",01));
        pList.add(new Student("Saumrit",02));
        pList.add(new Professor("Alexander",125));
        pList.add(new Student("Sobha",03));
        pList.add(new Student("Sandeep",04));

        //TODO can use Inheritance+Polymorphism
       /* for (Person identifier:pList){
            identifier.ShowDetails(); //
        }

        */    //TODO use of instanceof(This process not recommended due to multiple use of if-else & lengthy)
        for (Person identifier:pList){
            if(identifier instanceof Professor){
                Professor p11=(Professor)identifier; //casting to Professor class
                p11.ShowDetails();   //without casting it can't access Showdetails() as it is  a method of Professor class.
            }
            else if (identifier instanceof Student) {
                Student s1=(Student)identifier;
                s1.ShowDetails();

            }
        }

    }
}

