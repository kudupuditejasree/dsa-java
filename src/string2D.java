import java.util.Scanner;

public class string2D {
    public static void main(String[] args) {
        String[][] str = new String[2][];
        str[0] = new String[2];
        str[1] = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter names:");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                str[i][j] = scanner.next();
            }
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]+" ");
            }

            System.out.println();
        }

    }
}
