import java.util.Arrays;

public class javaUtil2DArrays {
    public static void main(String[] args) {
        int[][] myTwoArray={{2,4},{0,56}};
        int[][] yourTwoArray={{2,4},{0,56}};
        System.out.println(myTwoArray);
        System.out.println(Arrays.toString(myTwoArray));
        System.out.println(Arrays.deepToString(myTwoArray));
        System.out.println(Arrays.equals(myTwoArray,yourTwoArray));//compare addresses these are not same so false
        System.out.println(Arrays.deepEquals(myTwoArray,yourTwoArray));

    }
}
