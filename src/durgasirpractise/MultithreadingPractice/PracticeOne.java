package durgasirpractise.MultithreadingPractice;

public class PracticeOne {

    private   static PracticeOne practiceOne;
        String s;
        private PracticeOne(String s) {
            this.s=s;
        }

    static PracticeOne getPracticeOne(String ss){
        if (practiceOne==null){
            System.out.println("Initializing Practiseone.....");
            practiceOne= new PracticeOne(ss);
        }
        practiceOne.s=ss;
        return practiceOne;
     }

    public static void main(String[] args) {
        PracticeOne p10=getPracticeOne("Saumrit");
        System.out.println(p10.hashCode());
        System.out.println("printing s of P10 "+p10.s);

        PracticeOne p11=getPracticeOne("Monalisa");
        System.out.println(p11.hashCode());
        System.out.println("printing s of P11 "+p11.s);

        System.out.println("Again printing details of p10......");
        System.out.println("printing s of P10 "+p10.s);

    }
}
