import java.util.Arrays;

public class arrayReverseWhile {

    static int[] reverseArray(int[] arr1) {
        // int[] arr={1,2,3,4,5};
        int rightIndex = arr1.length - 1;
        int halfIndex=arr1.length/2;
        //for (int i = 0; i < halfIndex; i++) {
        int leftIndex=0;
        while(leftIndex<halfIndex){
            int temp = arr1[rightIndex];
            arr1[rightIndex] = arr1[leftIndex];
            arr1[leftIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        //System.out.println(Arrays.toString(arr1));
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

}
