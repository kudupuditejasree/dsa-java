import java.util.Scanner;

public class sum2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rows:");
        int rows = scanner.nextInt();
        System.out.println("enter number of columns");
        int cols = scanner.nextInt();
        int[][] myArray = new int[rows][cols];
        System.out.println("enter number of elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                myArray[i][j] = scanner.nextInt();

            }
        }
        int sum=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + myArray[i][j];
            }


        }
            System.out.println("sum is:"+sum);

    }
}
