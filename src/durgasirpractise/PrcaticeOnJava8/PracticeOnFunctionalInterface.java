package durgasirpractise.PrcaticeOnJava8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PracticeOnFunctionalInterface {
    public static void main(String[] args) {
        Student12 s1=new Student12("Monalisa",90);
        Student12 s2=new Student12("Saumrit",80);
        Student12 s3=new Student12("Dunguru",70);
        Student12 s4=new Student12("Dingding",25);
        Student12 s5=new Student12("Rimjhim",50);
        Student12[] s100={s1,s2,s3,s4,s5};
        //todo used function to evaluate grade
        Function<Student12,String> f1=s->{
            String grade="";
            if(s.getMarks()>=80) grade="First Class";
            else if (s.getMarks()>=60) {
                grade="Second class";
            } else if (s.getMarks()>=30) {
                grade="Third class";
            }
            else grade="fail";
            return grade;
        };
        //todo used function to evaluate grade using ternary operator

        Function<Student12,String> f2=s->
                (s.getMarks()>=80?"First class":
                (s.getMarks()>=60?"Second class":
                (s.getMarks()>=30?"Third class":"fail")));

        //todo used predicate to identify the students who secured mark more than 60
        Predicate<Student12> p1=ss1->ss1.getMarks()>60;
        //todo used consumer to print the students information & grade(we can use function here as well)
        Consumer<Student12> c1=s->{System.out.println(s.getName()+","
                +s.getMarks()+","+
                f2.apply(s));

        };
        Consumer<Student12> c2=s->{
            System.out.print("printing name with upper case :"+s.getName().toUpperCase());

        };Consumer<Student12> c3=s->{
            System.out.print(", printing name with Lower case :"+s.getName().toLowerCase());
            System.out.println();

        };
        //todo used consumer chaining of c1,c2,c3 using andThen
        Consumer<Student12> cc=c1.andThen(c2).andThen(c3);
        System.out.println("--------------------------------");
        System.out.println("Printing all students grades ");
        System.out.println("--------------------------------");
        for(Student12 ss:s100){
            System.out.println(ss.getName()+","+f2.apply(ss));

        }
        System.out.println("--------------------------------");
        System.out.println("Printing the students who secured more than 60");
        System.out.println("--------------------------------");
        for(Student12 ss:s100){
            if(p1.test(ss)){
                System.out.println(ss.getName()+","+f2.apply(ss));
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Printing the student using consumer");
        System.out.println("----------------------------------");
        for(Student12 ss:s100){
            c1.accept(ss);
        }
        System.out.println("----------------------------------");
        System.out.println("Printing method consumer chaining");
        System.out.println("----------------------------------");
        for(Student12 ss:s100){
            cc.accept(ss);
        }
    }
}
