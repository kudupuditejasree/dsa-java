public class operationsOnArrays {
    static void traverseArray(int[] arr1,int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        for(int i: arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        int i=0;
        while(i<size){
            System.out.println(arr1[i]);
            i++;
        }

    }
    public static void main(String[] args) {
        int[] arr=new int[15];
        int size=5;
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        traverseArray(arr,size);



    }
}
