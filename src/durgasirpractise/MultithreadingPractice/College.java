package durgasirpractise.MultithreadingPractice;

public class College {
    String studentName;
    int studentId;


    @Override
    public String toString() {
        return
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    private static College c1;

    private College(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }
    public static College getCollegeObject(String Name,int id){
       if(c1==null){
           c1=new College(Name, id);
           return c1;
       }c1.studentName=Name;
       c1.studentId=id;
       return c1;
    }
    public void print(){
         for( int number=0;number<100;number++){
             System.out.println("prining number value "+number);
            }

    }
}
