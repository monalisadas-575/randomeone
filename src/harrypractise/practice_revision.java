package harrypractise;

//Problem-1
/*
public class practice_revision {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      while(true) {
          try {

              System.out.println("Enter ur english mark");
              float eng = sc.nextFloat();
              System.out.println("Enter ur Physics Marks");
              float phy = sc.nextFloat();
              System.out.println("Enter ur computer mark");
              float com = sc.nextFloat();
              float percentage = (eng + phy + com) / 3;
              System.out.println("The percentage of three subject is :" + percentage + "%");
              break;
          } catch (Exception e) {
              System.out.println("invalid Input ! Please enter valid input ");
              sc.next();

          }
      }
  }
}



 */




//Problem-2
/*
public class practice_revision{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ur income amount");
        double tax= 0;
        double Income=sc.nextFloat();
        if(Income<=2.5f ){
            tax=tax+0;
        }
        else if(Income>2.5 && Income<=5.0){
            tax=(Income-2.5)*0.05;
        }
        else if(Income>5.0 && Income<=10.0){
            tax= (2.5*0.05) +(Income-5)*0.2;
        }
        else if(Income>10.0) {
            tax = (2.5 * 0.05)+(5.0*0.2) + (Income - 10) * 0.3;
        }
    }
}

 */



//Break Statement
//(Problem_1 : For loop)
/*
public class practice_revision {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                System.out.println("Loop is ending");
                continue;
            }

        }
        System.out.println("loop end here");

    }

}

 */


//Loop
/*
public class practice_revision {
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }

}

 */


//Practice-2 on loops
/*
public class practice_revision {
    public static void main(String[] args) {
        int sum=0;
     int n=4;
     int i=0;
     while( i<n){
      sum=sum+(2*i);
      i++;
     }
        System.out.println(sum);
    }
    }

 */
//Addition of two matrix.
/*
public class practice_revision {
    public static void main(String[] args) {
        int[][]mat1={{1,2,3},{4,5,6}};
        int[][]mat2={{2,6,13},{3,7,1}};
        int[][] result={{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
    }

 */
//Reverse an array
/*
public class practice_revision {
    public static void main(String[] args) {
        int[] arr={1,21,3,4,5,34,67};
        int l=arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element: arr){
            System.out.print(element +" ,");
        }

    }
}

 */

//to find the maximum element in an array
/*
public class practice_revision {
    public static void main(String[] args) {

int[] arr={1,21,3,455,5,34,67};
int max=0;
for(int e:arr){
    if(e>max){
        max=e;
    }
}
        System.out.println("The maximum element is :"+max);
    }
}

 */

//to find array is sorted or not
/*
public class practice_revision {
    public static void main(String[] args) {
        boolean isSorted=true;
       int[] arr={1,21,3,45,5,34};
      for(int i=0;i<arr.length-1;i++){
          if(arr[i]<arr[i+1]){
              isSorted=false;
              break;
          }
      }
      if(isSorted){
          System.out.println("the array is sorted");
      }
      else{
          System.out.println("the array is not sorted");
      }
    }
}

 *///for practice
/*
public class practice_revision {
    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {1, 21, 3, 45, 5, 34};
        for (int i = 0; i < arr.length - 2; i++) {
            System.out.print(arr[i] + "-" + arr[i + 2]);
            System.out.println(" ");

        }
    }
}

 */

public class practice_revision {
    public static void main(String[] args) {
        class example {
            static void mona() {
                System.out.println("Good Morning");
            }
        }


    }
    }