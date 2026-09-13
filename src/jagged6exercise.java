public class jagged6exercise {
    static void displayMethod(int[][] myArray){
        for(int i=0;i< myArray.length;i++){
            int count=0;
            for (int j=0;j<myArray[i].length;j++){
                count++;

            }
            System.out.println("row "+(i+1)+" has "+count+" elements");

        }
    }
    static void calculateSum(int[][] myArray){
        for(int i=0;i< myArray.length;i++){
            int sum=0;
            for (int j=0;j< myArray[i].length;j++){
                sum=sum+myArray[i][j];
            }
            System.out.println("row"+(i+1)+" "+"sum:"+sum);
        }

    }


    public static void main(String[] args) {
        int[][] jaggedArray={{1,2,3},{4,5},{10,7,5,-1}};
        displayMethod(jaggedArray);
        calculateSum(jaggedArray);

    }
}
