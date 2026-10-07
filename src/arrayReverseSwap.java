import java.util.Arrays;

public class arrayReverseSwap {

    static void reverseArray(int[] arr1) {
        // int[] arr={1,2,3,4,5};
        int rightIndex = arr1.length - 1;
        int halfIndex=arr1.length/2;
        for (int i = 0; i < halfIndex; i++) {
            int temp = arr1[rightIndex];
            arr1[rightIndex] = arr1[i];
            arr1[i] = temp;
            rightIndex--;
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            reverseArray(arr);
        }


    }

