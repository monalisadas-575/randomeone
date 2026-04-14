package durgasirpractise.PrcaticeOnJava8;


import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class PracticeOnBiFunction {
    public static void main(String[] args) {
        ArrayList<Student12> al1=new ArrayList<>();

        //todo by using Bifunction we take 2 input String & integer and return Student12 object.
        BiFunction<String,Integer,Student12> bf1=(name,marks)->new Student12(name,marks);
        al1.add(bf1.apply("Mona",100));
        al1.add(bf1.apply("Sumi",200));
        al1.add(bf1.apply("Saomi",300));
        al1.add( bf1.apply("Behera",350));
        al1.add(bf1.apply("Monalisa",150));
        for(Student12 ss:al1){
            System.out.print(ss.getName());
            System.out.print(" :"+ss.getMarks());
            System.out.println();
        }
        //todo by using  BiConsumer we are going to add 50 marks to each student marks.
        System.out.println("=========BIConsumer=====================12");
        BiConsumer<Student12,Integer> bc1=(ss1,i1)-> ss1.setMarks(ss1.getMarks()+50) ;
        for (Student12 ss1:al1){
            bc1.accept(ss1,50);  //here applied biConsumer to each student mark.
            System.out.print(ss1.getName());
            System.out.print(" :"+ss1.getMarks());
            System.out.println();
        }

    }
}
