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
    static void maxRowElement(int[][] myArray){
        //int max=Integer.MIN_VALUE;
        for(int i=0;i< myArray.length;i++){
            int max=Integer.MIN_VALUE;
            //int sum=0;
            for (int j=0;j< myArray[i].length;j++){
              //  sum=sum+myArray[i][j];
                if(max<myArray[i][j]){
                    max=myArray[i][j];
                }

            }
            System.out.println("row "+(i+1)+" "+"max element is: "+max);
        }

    }
    static void maxSumRow(int[][] myArray){

            int maxSum=Integer.MIN_VALUE;
            int maxSumRowIndex=-1;
            for(int i=0;i< myArray.length;i++){
               // int maxSum=Integer.MIN_VALUE;
                int sum=0;
                for (int j=0;j< myArray[i].length;j++){
                    //  sum=sum+myArray[i][j];
                    sum=sum+myArray[i][j];

                }
                System.out.println("row "+(i+1)+" "+"sum: "+sum);
                if(sum>maxSum){
                    maxSum=sum;
                    maxSumRowIndex=i;
                }
            }
        System.out.println("row"+(maxSumRowIndex+1)+" has maxmimum sum");
        System.out.println(maxSum);


    }



    public static void main(String[] args) {
        int[][] jaggedArray={{1,2,3},{4,5},{10,7,5,-1}};
        displayMethod(jaggedArray);
        calculateSum(jaggedArray);
        maxRowElement(jaggedArray);
        maxSumRow(jaggedArray);

    }
}
