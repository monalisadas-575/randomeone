package durgasirpractise.PrcaticeOnJava8;
import durgasirpractise.fundametalpractise.util1.Student;
import java.util.function.Predicate;

public class PredicatePractice2 {
    public static void main(String[] args) {
        PredicatePractice2 pp2=new PredicatePractice2();
        Student s3=new Student("Sobha",110);
        Student s4=new Student("Sandeep",115);
        Student s5=new Student("Styabrata",120);
        Student s6=new Student("Manisha",125);
        Student s7=new Student("Sobha",110);
        Student[] s1={new Student("Monalisa",100),new Student("Saumrit",105),s3,s4,s5,s6,s7};

        Predicate<Student> p1=s->s.getStudentId()>110;
        for(Student ele:s1){
            if(p1.test(ele)){
                System.out.println(ele);
            }
        }
    }
}
