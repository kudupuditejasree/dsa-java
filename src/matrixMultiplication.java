import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input dimensions for first matrix1
        System.out.println("enter number of rows for m1:");
        int rows1 = scanner.nextInt();
        System.out.println("enter number of columns for m2");
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        //input m2
        System.out.println("enter number of rows for m2:");
        int rows2 = scanner.nextInt();
        System.out.println("enter number of columns for m3");
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        if(cols1!=rows2){
            System.out.println("cannot multiply these matrices");

        }

        //initializing matrix1
        System.out.println("enter elements:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();

            }
        }


        System.out.println("printing 2D arrays(matrix):");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j] + " ");

            }
            System.out.println();
        }

        //Scanner scanner = new Scanner(System.in);

        //initializing matrix2
        System.out.println("enter elements:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();

            }
        }
        System.out.println("printing 2D arrays(matrix):");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix2[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("printing matrix3:");
        int[][] matrix3 = new int[rows1][cols2];
        System.out.println();
        for(int i=0;i<rows1;i++){
            for (int j=0;j<cols2;j++){
                int sum=0;
                for (int k=0;k<cols1;k++){
                    sum=sum+matrix1[i][k]*matrix2[k][j];
                }
                matrix3[i][j]=sum;
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }



    }
}
