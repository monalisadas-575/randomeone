package harrypractise.practiceonmethodofjava;

public class Concept_method {
    //static logic() inside static main()  can be called directly


 /*   static int logic(int x, int y){
        int z;
        if (x > y) {
            z = x + y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        System.out.println("The value is :"+c);
        System.out.println("The value is :"+c1);
    }*/


//non- static logic() needs an object to call the static main()

 /*   int logic(int x, int y){
        int z;
        if(x>y) {
            z = x + y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        Concept_method obj= new Concept_method();
        int c=obj.logic(a,b);
        int a1=2;
        int b1=1;
        int c1=obj.logic(a1,b1);
        System.out.println("The value is :"+c);
        System.out.println("The value is :"+c1);


    }*/


//Primitive type method doesn't affect original value.

  /*  static void change (int a){
        a= 98;
    }
    public static void main(String[] args) {
        int x=45;
        change(x);
        System.out.println("The value of x after running change :"+x);
    */


//Pass-by-value can affect refernce type data(array, object)

 /*   static void change2(int []arr) {
    arr[0] = 98;
    }

    public static void main(String[] args) {

        int[] marks = {52, 73, 77, 89, 98, 94};
        change2(marks);
        System.out.println("The value of array after running change :"+marks[0]);

    }*/


//Method overloading
 /*   static void foo(){
        System.out.println("Good Morning bro !");
    }
    static void foo(int a){
        System.out.println(" Good Morning bro " +a);
    }
    static void foo(int a, int b){
        System.out.println(" Good Morning bro " + a);
        System.out.println(" Good Morning bro " + b);
    }


    public static void main(String[] args) {


        foo();
        foo(300);
        foo(300, 400);
    }*/


    //variable arguments(varargs)

 /*  static int sum(int ...arr){
       int result=0;
       for(int a:arr) {
           result += a;
       }return result;
   }

    public static void main(String[] args) {
        System.out.println("The sum of 4 & 5 is :" +sum(4,5));
        System.out.println("The sum of 4,5,6 is :" +sum(4,5,6));
        System.out.println("The sum of 4 ,7, 5 is :" +sum(4,7,5));
    }*/


    //Recursion method(factorial of n )

  /*  static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        int x=4;
        System.out.println("The value of factorial x is : "+fact(x));
    }
*/


    //Printing stars in triangle method(using recursion method)

 /*   static void pattern(int n) {
        if (n > 0) {
            pattern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*"+ " ");
            }

            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        pattern(7);
    }
}*/


//Number triangle(increasing order using recursion method)
 static void print_number(int n){
      if(n>0){
          print_number(n-1);
         // System.out.println("Printing of number n");
          for(int i=1;i<=n;i++){
              System.out.print(i+" ");
          }
          System.out.println(" ");
      }
  }

    public static void main(String[] args) {
        print_number(5);
    }


    //Star Triangle(Decreasing order using recursion method)
/*

    static void star(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            star(n - 1);
        }
    }

    public static void main(String[] args) {
        star(5);
    }
}

 */

    //Printing a number line from 1 to N and back(eg-3,2,1,1,2,3)
//    static void star(int n) {
//        if (n > 0) {
//            for (int i = n; i <= n; i--) {
//                System.out.print(i);
//            }
//            star(n - 1);
//        }
//    }

   // public static void main(String[] args) {
     //   star(3);
   // }
}


    /*
        static void printNumbers(int n) {
            if (n == 0) return;
            printNumbers(n - 1);      // recursive call
            System.out.print(n + " "); // after call
        }

        public static void main(String[] args) {
            printNumbers(5);
        }
    */
 /*   static void print(int n) {
        int result=0;
        if(n>0){
            print(n-1);
            for (int i = 1; i < n; i++) {
                  result+= i;

            }System.out.println(result);
        }
    }
    public static void main(String[] args) {
        print(4);
    }
}*/
    //dundun Code
 /*   static void print(int n) {
        for (int i = n; i > 0; i--) {
            int ii=i;
            System.out.print("(");
            while (ii > 0) {
                System.out.print(" " + ii);
                if(ii != 1)
                    System.out.print(" + " );
                ii--;
            }
            System.out.print(" )" + " +");

            System.out.println();
        }



    }
    public static void main (String[]args){
        print(4);
    }*/

//Recursive problem to get printed(like this 4*3*2*1=24 upto given integer from integer 1)
/*
   static void print45(int n) {
        int product = 1;
        if (n > 0) {
            print45(n-1);
            for (int i = n; i >= 1; i--) {
                product *= i;
                if (i != 1) {
                    System.out.print( i+"*");
                }else{
                    System.out.print(i+"=");
                }
            }
            System.out.println(product);

        }

    }

 //public static void main(String[] args) {

 }















    }




*/
