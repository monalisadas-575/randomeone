package durgasirpractise.fundametalpractise;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //TODO array declaration
        int []x;   //Recommended
        int[] x1;   //can write like this
        int x2[];

        int[][] a,b;
        int[] a1,b1[];
       // int[] a2,[]b2;  // ([]) dimension before the variable is applicable only for 1st variable

        //TODO array creation
        int []x3=new int['a'];   // To specify array size byte, short , char, int allowed
        byte b23=10;
        int []x44=new int[b23];
        boolean[] x4=new boolean[5];
        System.out.println(x3.getClass());// class int
        System.out.println(x3.length);    //97
        System.out.println(x4.getClass());    //class [Z
        //int []x5=new int[];   //--if during creation size should specify
        int []x6=new int[0];  //  0 size will not give any error so atleast 0
       // int []x7=new int[-3];   //RE -NegativeArraySizeException
        //int []x8=new int[2147483647];   //allowed up to max. int value

        //TODO Aarrys of array/ 2D array creation
        int[][] a3=new int[2][];
        a3[0]=new int[3];
        a3[1]=new int[3];
        // above array is consist of 2 rows & 3 column
        int[][]a4=new int[3][];
        //int[][] a5=new int[][5];  //  atleast base base size needed. 1st dimension cant be empty.

        //ToDO array Intialization
        int[] a6=new int[3];
        System.out.println(a6);   //[I@4eec7777  classname@hashcode(tostring method called)
        System.out.println(a6[0]);  //default value intialize

        //TODO int type array
        int[]a7=new int[5];
        int[]a8={3,2,4,5};
        for(int ele:a8){
            System.out.println(ele);
        }
        System.out.println(Arrays.toString(a7));

        //TODO what will get store if we dont override values
        System.out.println();
        int[] a9=new int[5];
        System.out.println("default value for int type array");
        System.out.println(Arrays.toString(a9));
        double[] a10=new double[3];
        System.out.println("default value for float/double");
        System.out.println(Arrays.toString(a10));
        System.out.println("default value for char tpe array");
        char[] a11=new char[3];
        System.out.println(Arrays.toString(a11));
        System.out.println("default value for boolean type array");
        boolean[] a12=new boolean[4];
        System.out.println(Arrays.toString(a12));

        //TODO for 2D fully allocated array
        int[][] a13=new int[3][4];
        for(int[] el2:a13){
            System.out.println(Arrays.toString(el2));
        }
        //TODO for Jagged(patrially allocated)2D array
        /*

         java creates only outer array with null value
        a14[0]=null , a14[1]=null , a14[2]=null internally.
        inner arrays not created yet . so all of them are null.
        after u create inner array like
        a14[0]=new int[4];
        then the default value will store
        a14[0]=[0,0,0,]
        a14[1]=null
        a14[2]=null because for them inner arrays are not created yet.

         */
        int[][]a14=new int[3][];
        System.out.println(Arrays.deepToString(a14));   //  [null, null, null]
        System.out.println(a14[0]);   //  null
       // System.out.println(a14[0][0]);  NPE

        //TODO Array declaration, creation , Initialization in a single line
        int []ad1={10,20,30};
        int[][]ad2={{10,20},{30,40,50}};

        int[][][]ad3={{{10,20,30},{40,50,60},{70,80},{90,100,110}}};
        System.out.println(ad3[0][2][1]);  //0th block row 2(3rd line) column 1= 80
        //System.out.println(ad3[0][2][2]);  //ArrayIndexOutOfBoundException
        for(int i=0;i<ad3.length;i++){
            for(int j=0;j<ad3[i].length;j++){
                System.out.print("[");
                for(int k=0;k<ad3[i][j].length;k++){
                    //System.out.println("["+i+" ,"+j+" ,"+k+"]" +ad3[i][j][k]); //TODO print all index of array element in 3D array
                    System.out.print(ad3[i][j][k]);
                    System.out.print(",");
                }
                System.out.print("]");
                System.out.println();
            }
        }

        //TODO length Vs lenth()
        int[] lc1=new int[6];
        System.out.println(lc1.length);  //6   ---> to check array length
       // System.out.println(lc1.legth());   //cant find symbol--> for check String object length

        String[] s1={"MOna","Lina","Tu","Sun"};
        System.out.println(s1.length);    // here s1.length =4
       // System.out.println(s1[0].length);  // java: cannot find symbol ,symbol:   variable length
        System.out.println(s1[0].length());     // 4  in s[0] is string to find its length , use length()
        System.out.println(s1[1]);             //Lina
        System.out.println(s1[2].length());    // 2

        //TODO elements assignments in Array
        int[] ass1=new int[5];
        ass1[0]=304;
        byte b100=23;
        ass1[1]=b100;
        short s100=600;
        ass1[2]=s100;
        //ass1[3]= Integer.parseInt("ab");    // RE:NumberFormat Exception
        ass1[3]= Integer.parseInt("23");   //Here we are entering string.
        //ass1[4]="mona";     //found:java.long.string, required:int
        System.out.println(Arrays.toString(ass1));   //[304, 23, 600, 23,0]

        Object[] obj=new Object[3];
        obj[0]="mona";
        Object obj2= 10;
        Object obj3=obj2.toString();
        obj[1]=obj3;
        System.out.println(obj[2]);
        System.out.println(Arrays.toString(obj));   //[[mona, 10, null]

    }
}
