import java.util.Arrays;

public class javaUtilArrays {
    public static void main(String[] args) {
        int[] myArray={10,4,7,0,67,3,2,9,5};
        int[] yourArray={10,4,7,0,67,3,2,9,5,8,1,3};

        System.out.println(Arrays.toString(myArray));
        //Arrays.sort(myArray,2,6);//ascending
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.equals(myArray,yourArray));
        System.out.println(Arrays.equals(myArray,0,8,yourArray,0,8));
        System.out.println(Arrays.equals(myArray,0,8,yourArray,0,8));






    }
}
