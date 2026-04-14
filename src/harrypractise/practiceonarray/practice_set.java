package harrypractise.practiceonarray;

public class practice_set {
    public static void main(String[] args) {

        //problem_1 : prrint matrix one after another

       /* int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] mat2 = {
                {2, 6, 13},
                {3, 7, 1}
        };
        System.out.println("Matrix 1:");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
*/


        //Problem_2: print  2 matrices side by side

    /*    int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] mat2 = {
                {2, 6, 13},
                {3, 7, 1}
        };
        System.out.println("Matrix 1    Matrix 2");
        for(int i =0;i<mat1.length;i++){
            for(int j =0;j<mat1[i].length;j++){
                System.out.print(mat1[i][j]);
                System.out.print(" ");
            }
            System.out.print("      ");

            for(int j =0;j<mat2[i].length;j++){
                System.out.print(mat2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
*/



        //Problem_3: Matrix showing side by side with result matrix(addition)

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5}
        };

        int[][] mat2 = {
                {2, 6, 13},
                {3, 7}
        };
        int[][] res = {
                {0, 0, 0},
                {0, 0}
        };
        System.out.println("Matrix 1              Matrix 2           Matrix 3");
        for(int i =0;i<mat1.length;i++){
            for(int j =0;j<mat1[i].length;j++){
                System.out.print(mat1[i][j]+"   ");
                //System.out.print(" ");
            }
            System.out.print("          ");

            for(int j =0;j<mat2[i].length;j++){
                if (i == 1&j==0) {
                    System.out.print("    ");
                }
                System.out.print(mat2[i][j]);
                System.out.print("  ");


            }System.out.print("         ");
            for(int j =0;j<mat1[i].length;j++){
                if (i == 1 & j == 0) {
                    System.out.print("    ");
                }
                System.out.print(res[i][j] =mat1[i][j] +mat2[i][j]);
                System.out.print("  ");
            }

            System.out.println();
        }







    }
}
