package harrypractise.practiceonarray;

public class ConceptTwo {
    public static void main(String[] args) {

//       int[][] flats = new int[2][3];
//       flats[0][0]= 101;
//       flats[0][1]= 102;
//       flats[0][2]= 103;
//       flats[1][0]= 201;
//       flats[1][1]= 202;
//       flats[1][2]= 203;
//       for (int i=0;i<flats.length;i++){
//        for(int j=0;j<flats[i].length;j++){
//            System.out.print(flats[i][j]);
//            System.out.print(" ");
//        }
//           System.out.println(" ");
//       }





        /*
        float []marks ={45.7f, 67.8f, 63.0f, 99.2f,100.0f};
        float num=45.7f;
        boolean isInArray = false;
        for (float element:marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
            if (isInArray) {
                System.out.println("The value is present");
            } else {
                System.out.println("The value is not present");
            }
*/


//calculate avg marks from an array containing marks of all students
     /*   int [] marks = {34,56,67,89,65};
        int no =marks.length;
        int sum = 0;
        for(int element: marks){
            sum= sum+element;
            System.out.println(element);
        }
        System.out.println("the average of marks is " +sum/no);
        */


        // create a java program to add two 2D matrix of size 2x3

    /*  int[][]mat1 = {{1,2,3},
                    {4,5,6}};
      int[][]mat2 = {{2,6,13},
                     {3,7,1}};
      int[][]result = {{0,0,0},
                      {0,0,0}};
        System.out.println("Result matrix");
      for (int i= 0; i< mat1.length;i++) {
          for (int j = 0; j < mat1[i].length; j++) {
              result[i][j] = mat1[i][j] + mat2[i][j];
              System.out.print(result[i][j] +" ");
          }
          System.out.println();
      }*/


        // Write a Java program to reverse an array
   /*
        int[]arr= {1,21,3,4,5,34,67};
        int l=arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element:arr){
            System.out.print(element +" ");
        }*/


        // Write a java program to find the maximum element in an array.
      /*  int[] arr = {1, 21, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }

        }
        System.out.println("the maximum value of this array is:" + max);


        */


       //Write a java program to find whether an array is sorted or not

        boolean isSorted= true;
        int[] arr={1,21,3,45,5,34};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]) {
                isSorted = false;
                break;

            }
        }
        if(isSorted){
            System.out.println("the array is sorted");
        }
       else{
            System.out.println("The array is not sorted");
        }

    }
    }

