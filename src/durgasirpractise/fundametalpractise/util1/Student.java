package durgasirpractise.fundametalpractise.util1;

 public class Student extends Person {
    int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

     public int getStudentId() {
         return studentId;
     }

     public void setStudentId(int studentId) {
         this.studentId = studentId;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", studentId=" + studentId +
                 '}';
     }

     @Override
  public void ShowDetails() {
        System.out.println("Student-> name: "+name+", Id: "+studentId);
    }
}
