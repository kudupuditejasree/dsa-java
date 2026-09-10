import java.util.Scanner;

public class T2DArrays2 {
    public static void main(String[] args){
        int[][] myArray=new int[2][3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter elements of my array:");
        for(int  i=0;i< myArray.length;i++){
            for(int  j=0;j< myArray[i].length;j++){
                System.out.println("Element["+i+"]["+j+"]:");

                myArray[i][j]= scanner.nextInt();
            }

        }
        for(int  i=0;i< myArray.length;i++){
            for(int  j=0;j< myArray[i].length;j++) {
                System.out.print(myArray[i][j]+ " ");

            }

            System.out.println();

        }




    }

}



