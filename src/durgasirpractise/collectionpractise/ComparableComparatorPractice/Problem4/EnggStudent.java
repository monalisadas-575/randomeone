package durgasirpractise.collectionpractise.ComparableComparatorPractice.Problem4;

public class EnggStudent implements Comparable{
    //age,grade variable(Char)
    private int age;
    private char studentGrade;

    public EnggStudent() {
    }

    public EnggStudent(int age, char studentGrade) {
        this.age = age;
        this.studentGrade = studentGrade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(char studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return "{age=" + age +
                ", studentGrade=" + studentGrade+'}' ;
    }

    @Override
    public int compareTo(Object o) {
        EnggStudent es1=(EnggStudent)o;
        return this.getAge()-es1.getAge();
    }
}
