package harrypractise.ErrorOnJava;

import java.util.Scanner;


//public class Practice_Errors {
    // 1. Arithmetic exception
  /*  public static void main(String[] args) {
       int a=6000;
        int b=0;
        try{
            int c= a/b;
            System.out.println("The result is :"+c);
        }
        catch(ArithmeticException e){
            System.out.println("We failed to divide");
            System.out.println(e);

        }
        System.out.println("End of the program");
    }

}*/


// 2. NullPointer Exception
/*
    public static void main(String[] args) {
try{
    String str=null;
    System.out.println(str.length());
}
catch(NullPointerException e){
    System.out.println("Null reference! Cant call null method");
}

    }
}*/


    //3. ArrayIndexOutOfBounds exception (Accessing Invalid index in an array)
   /* public static void main(String[] args) {
try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[3]);
}
        catch(Exception e ){
        System.out.println("Index out of bounds! Check array size" );

    }
    }
}*/


//4. NumberFormat Exception (trying to convert non-numeric string to numeric)
/*
    public static void main(String[] args) {
    try {
        String str = "abc";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
        catch(Exception e){
            System.out.println("invalid number format");
        }
    }
}*/





//5.ClassCastException(Invalid typecasting of objects)
/*
    public static void main(String[] args) {
try {
    Object obj = new String("1234");
    Integer num = (Integer) obj;
}
catch (ClassCastException e){
    System.out.println("can't cast String to integer");
}
    }

}*/




// 6.IllegalArgument Exception(Providing illegal argument to a method)
    /*
public static void main(String[] args) {
    try {
        Thread t = new Thread();
        t.setPriority(100);//must be between 1 to 10
    }
    catch(Exception e){
        System.out.println("Priority must be between 1 to 10!");
    }
    }
}*/





//7. illegalState Exception(Using the method when the object is not in the right state)
    /*
public static void main(String[] args) {
    try{
        Scanner sc= new Scanner(System.in);
        sc.close();
        sc.nextLine();//Using scanner after closing
    }
    catch(IllegalStateException e){
        System.out.println("Scanner is already closed");
    }

}
}
*/





//handling specific Exception(This can be handled in java using multiple catch block)
    /*
public static void main(String[] args) {
    int[] marks = new int[3];
    marks[0]=7;
    marks[1]=56;
    marks[2]=6;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array index");
    int ind=sc.nextInt();
    System.out.println("Enter the number which u want to divide");
    int num=sc.nextInt();
    try {
        System.out.println("The value at array index enetered :" + marks[ind]);
        System.out.println("The value of array value/number is :" + marks[ind] / num);
    }catch(ArithmeticException e) {
        System.out.println("ArithmeticException occured");
        System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException occured");
        System.out.println(e);
    }
    catch(Exception e){
        System.out.println("Some other exception occured");
        e.printStackTrace();

    }
}
}*/








//Nested Try-catch
    /*
public static void main(String[] args) {
 int[] marks=new int[3];
 marks[0]=7;
 marks[1]=56;
 marks[2]=6;
 Scanner sc=new Scanner(System.in);
    System.out.println("Enter the new value of index");
    int ind=sc.nextInt();
    System.out.println("Enter the no u want to divide");
    int num=sc.nextInt();
    try{
        System.out.println("Print The value of array :"+marks[ind]);
    try{
        System.out.println("The value of array-value/number is :"+marks[ind]/num);
    }
    catch(ArithmeticException e){
        System.out.println("this is an arithmetic exception");
        System.out.println("exception in level 2");
    }

    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index is out of bound");
        System.out.println("Exception in level 1");
    }

}
}*/





//Write a program that allows u to  keep accessing an array until a valid index is given by the user.
/*
public static void main(String[] args) {
    int[] marks=new int[3];
    marks[0]=7;
    marks[1]=56;
    marks[2]=6;
    boolean flag=true;
    Scanner sc=new Scanner(System.in);
    while(flag){
        System.out.println("Enter the value of index");
        int ind=sc.nextInt();
        try {
            System.out.println(marks[ind]);
            flag = false;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("This index doesn't exist");
            System.out.println("Exception level-1");
        }
        catch(Exception e){
            System.out.println("exception in level-1");
        }
    }
    System.out.println("Thanks for using this program");


}
}*/






//Custom Exception in java
/*
class MyException extends Exception{
    @Override
public String toString(){
        return "I am toString()";
}
@Override
    public String getMessage(){
        return "I am getMessage()";
}

    }
    public class Practice_Errors {
        public static void main(String[] args) {
            int a;
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
            if(a<9){
                try{
                    throw new MyException();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    e.toString();
                    e.printStackTrace();
                    System.out.println("Finished");
                }
                System.out.println("Yes!Finished");
            }
}
}*/




//Custom Exception Using NullPointerException
/*
    public class Practice_Errors {
        public static void main(String[] args) {
            try {
                String str = null;
                System.out.println(str.length()); // This throws NullPointerException
            } catch (NullPointerException e) {
                System.out.println("getMessage(): " + e.getMessage());
                System.out.println("toString(): " + e.toString());
                System.out.println("printStackTrace(): ");
                e.printStackTrace();
            }
            System.out.println( "Finished");
        }

    }*/





//Throw and Throws(Ex-1)
/*
class division {
    int divide(int a, int b) throws ArithmeticException {
        int res = a / b;
        return res;
    }
}
    public class Practice_Errors {
        public static void main(String[] args) {
            division div = new division();
            try {
                int c = div.divide(8, 0);
                System.out.println(c);
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }*/





//Throw and Throws(Ex-2)
/*
class NegativeRadiusException extends Exception{
    @Override
   public String toString(){
        return "Radius can't be negative";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}
public class Practice_Errors{
   // public static void main(String[] args) {
        public static double area(int r) throws NegativeRadiusException {
            if (r < 0) {
                throw new NegativeRadiusException();
                double result = Math.PI * r * r;
                return result;
            }
        }

            public static void main (String[]args){
                try {
                    double ar = area(6);
                    System.out.println(ar);
                }catch(Exception e){
                    System.out.println("Exception");
                }

            }

}*/

public class Practice_Errors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (type 'exit' to quit):");

        while (true) {
            if (scanner.hasNextInt()) {
                // Valid integer
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
            } else if (scanner.hasNext("exit")) {
                // User typed exit
                System.out.println("Exiting...");
                break;
            } else {
                // Invalid input
                System.out.println("Invalid input! Please enter an integer or 'exit'.");
                scanner.next(); // skip the invalid token
            }
        }

        scanner.close();
    }
}















