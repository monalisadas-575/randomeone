package durgasirpractise.fundametalpractise;

class FlowControlPractice {
    public static void main(String[] args) {
        int x=10;
        int y=20;


        SwitchDemo1 sd1=new SwitchDemo1();
       // sd1.Demo();
        //sd1.checkDay();

        /*
        //TODO without curley braces 1 statement is possible.
        if(x==10)
            System.out.println("only one statement is allowed without curley braces");
        //System.out.println("2nd statement");                //--> else without if
        else
            System.out.println("else without curley braces");

        if(y==20)
            System.out.println("one statement is allowed without if " );


      //TODO Swtch case
        switch(x) {
            //TODO Indepedent statement are not allowed in switch
            // System.out.println(); ----> compile error Indepedent statement(Not declared inside any case/default label)
            case 10:
                System.out.println(10);
                break;
            // case y: constant expression required
            //TODO every case lebel should be in the range of swich argument.Otherwise Compile error
            case 2147483647:
                System.out.println(5677);
                break;
            //TODO dupliacte case labels are not allowed
            //case 10:-------> duplicate label 10
        }


         */

        }

    }
class SwitchDemo1{
   /* int z=0;
    void Demo(){
        switch(z){
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
        }
    }
    //TODO test for days from computer input
    void checkDay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("type the no of the day");
        int day= sc.nextInt();
        switch(day){
            case 0: case 1: case 3: case 4: case 5:
                System.out.println("Working day");
                break;
            case 6: case 7:
                System.out.println("weekend");
                break;
        }

    */

    }

