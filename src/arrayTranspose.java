import java.util.Scanner;

public class arrayTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rows:");
        int rows = scanner.nextInt();
        System.out.println("enter number of columns");
        int cols = scanner.nextInt();
        int[][] myArray = new int[rows][cols];
        System.out.println("enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                myArray[i][j] = scanner.nextInt();

            }
        }
        System.out.println("printing 2D arrays(matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArray[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("transpose matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(myArray[j][i] + " ");

            }
            System.out.println();
        }
    }
}
