import java.util.Arrays;

public class ArraysUtilBinaryCopy {
    public static void main(String[] args) {
        int[] arr1={80,10,20,30,40,40,50};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.binarySearch(arr1,30));
        System.out.println(Arrays.binarySearch(arr1,90));
        System.out.println(Arrays.binarySearch(arr1,40));
        System.out.println(Arrays.binarySearch(arr1,0,5,40));
        System.out.println(Arrays.binarySearch(arr1,0,5,50));
        int[] hisArray=new int[10];

        //Arrays.fill(hisArray,1);
        Arrays.fill(hisArray,2,6,1);

        System.out.println(Arrays.toString(hisArray));
        Arrays.fill(arr1,2,6,50);
        System.out.println(Arrays.toString(arr1));
        int[] copiedArray=Arrays.copyOf(arr1,15);
        System.out.println(Arrays.toString(copiedArray));




    }
}
