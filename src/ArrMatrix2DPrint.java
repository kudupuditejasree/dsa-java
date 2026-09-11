import java.util.Scanner;

public class ArrMatrix2DPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int rows= scanner.nextInt();
        System.out.println("enter number of columns");
        int cols= scanner.nextInt();
        int[][] myArray=new int[rows][cols];
        System.out.println("enter number of elements:");
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                myArray[i][j]=scanner.nextInt();

            }
        }
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(myArray[i][j]+" ");

            }
            System.out.println();
        }
    }
}
