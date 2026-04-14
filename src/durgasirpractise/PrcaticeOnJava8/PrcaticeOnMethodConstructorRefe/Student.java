package durgasirpractise.PrcaticeOnJava8.PrcaticeOnMethodConstructorRefe;

public class Student {
    String name;
    int id;
    int mark;
    int age;

    public Student(String name, int id, int mark, int age) {
        this.name = name;
        this.id = id;
        this.mark = mark;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mark=" + mark +
                ", age=" + age +
                '}';
    }
}
