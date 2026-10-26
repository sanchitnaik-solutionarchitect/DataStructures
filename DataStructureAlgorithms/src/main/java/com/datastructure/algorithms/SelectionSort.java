package com.datastructure.algorithms;

public class SelectionSort {

    public static int[] sort(int[] arr){
        int temp;
        for(int i = 0; i < arr.length; i++){
            int minPointer = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minPointer]){
                    minPointer = j;
                }
            }
            if(minPointer != i){
                temp = arr[i];
                arr[i] = arr[minPointer];
                arr[minPointer] = temp;
            }
        }
        return arr;
    }
}
