package durgasirpractise.PrcaticeOnJava8.PrcaticeOnMethodConstructorRefe;

public class MainIm {
    public static void main(String[] args) {
        Interf i1=((name, id, mark, age)->new Student(name,id,mark,age));
        //todo this lambda can be replaced by method refence.
        Interf i3=Student::new;
        Student s2=i1.get("Sumi",100,600,23);
         Student s1=i3.get("Mona",100,600,23);

        System.out.println("Printing student object by the help of method reference"+s1);
        System.out.println("Printing student object by the help of lambda expression"+s2);
    }
}
