package durgasirpractise.fundametalpractise;

public class TypesOfVariablePractice {
    int x=100;
    static int y=200;
    int z;
    int [] arr1;
    String[] arr2=new String[3];
    //TODO create getter & setter
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public static void main(String[] args) {
        //System.out.println(x);        //N0n static x cant be referenced from static context.
        TypesOfVariablePractice typ=new TypesOfVariablePractice();
        System.out.println(typ.x);
        System.out.println(y);
        typ.inst();
        TypesOfVariablePractice cv1=new TypesOfVariablePractice();

        cv1.x=2;
        cv1.y=5;
        System.out.println(cv1.x+"...."+cv1.y);    //2....5
        System.out.println(typ.x+"...."+typ.y);    //100....5

        try{
            int j=Integer.parseInt("ten");
        }catch(NumberFormatException e){
            //j=20;      -------> j is local variable. cant access from outside of block

            //TODO on array type element by default intialize with default value
            System.out.println(typ.arr1);                //null
           // System.out.println(typ.arr1[0]);             //NPE

            System.out.println(typ.arr2);                //[Ljava.lang.String;@5fd0d5ae
             System.out.println(typ.arr2[0]);             //null

            for(int test=0;test<3;test++){
                int[] test2;
               // System.out.println(test2);         //error variable test2 might not have been intialized

                System.out.println("checking the static method values");
                TypesOfVariablePractice typ2=new TypesOfVariablePractice();
                check();


            }

        }
    }
    public void inst(){
        //System.out.println(x);
        //System.out.println(y);//access directly without calling object from Instance area
    }
    public static void check(){
        TypesOfVariablePractice typ3=new TypesOfVariablePractice();
        System.out.println("printing the instance value :"+typ3.x);

    }
}

