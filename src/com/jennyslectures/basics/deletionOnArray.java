package com.jennyslectures.basics;

import static com.jennyslectures.basics.insertExceptionHandling.insertAtPosition;
import static com.jennyslectures.basics.insertExceptionHandling.traverseArray;
import static com.jennyslectures.basics.insertionATEnd.insertAtEnd;



public class deletionOnArray {
    static void deleteFromBeginning(int[] arr1){
        try {
            int size = 0;
            for (int num : arr1) {
                if (num != 0) {
                    size++;
                } else {
                    break;
                }
            }
            for(int i=0;i<size-1;i++){
                arr1[i]=arr1[i+1];
            }
            arr1[size-1]=0;
            size--;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    static void deleteFromEnd(int[] arr1){
        try {
            int size = 0;
            for (int num : arr1) {
                if (num != 0) {
                    size++;
                } else {
                    break;
                }
            }

            arr1[size-1]=0;
            size--;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    static void deleteFromPosition(int[] arr1,int pos){
        try {
            int size = 0;
            for (int num : arr1) {
                if (num != 0) {
                    size++;
                } else {
                    break;
                }
            }
            if (pos <= 0 || pos > size) {
                System.out.println("position is not valid");
            }else {

                for (int i = pos - 1; i < size - 1; i++) {
                    arr1[i] = arr1[i + 1];
                }
                arr1[size - 1] = 0;
                size--;
            }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }


    public static void main(String[] args) {
        int[] arr = new int[7];
        int size = 0;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        insertAtPosition(arr,1,90);
        //size++;
        traverseArray(arr);
        insertAtEnd(arr,57);
        insertAtPosition(arr,2,1);
        //size++;
        insertAtPosition(arr,3,90);
        //size++;
        insertAtPosition(arr,4,5);
       // size++;
        traverseArray(arr);
        //deleteFromBeginning(arr);
        //traverseArray(arr);
        //deleteFromEnd(arr);
        //traverseArray(arr);
        deleteFromPosition(arr,3);
        traverseArray(arr);
        deleteFromPosition(arr,9);
        traverseArray(arr);


    }



}
