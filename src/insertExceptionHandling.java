package com.jennyslectures.basics;
public class insertExceptionHandling {

    static void traverseArray(int[] arr1) {
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();


    }


    static void insertAtBeginning(int[] arr1, int x) {
        try {
            int size = 0;
            for (int num : arr1) {
                if (num != 0) {
                    size++;
                } else {
                    break;
                }
            }

            // if (size >= arr1.length) {
            //    System.out.println("we can't insert array is full");
            //  return;

            for (int i = size; i > 0; i--) {
                arr1[i] = arr1[i - 1];
            }
            arr1[0] = x;
            //size++;
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);



        }

    }
    static void insertAtPosition(int[] arr1,int pos,int x) {
        try {
            int size = 0;
            for (int num : arr1) {
                if (num != 0) {
                    size++;
                } else {
                    break;
                }
            }
            if (pos < 0 || pos > size + 1) {
                System.out.println("position is not valid");
            } else {
                for (int i = size; i <= pos; i--) {
                    arr1[i] = arr1[i - 1];
                }
                arr1[pos - 1] = x;
                size++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);


        }
    }


    public static void main(String[] args) {
        int[] arr = new int[7];
        //int size = 5;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        traverseArray(arr);
        //insertAtBeginning(arr,size);
        //System.out.println();
        insertAtBeginning(arr, 90);
        //System.out.println();
        //size++;
        traverseArray(arr);
        insertAtBeginning(arr, 89);
        traverseArray(arr);
        insertAtPosition(arr,3,99);
        traverseArray(arr);

    }
}