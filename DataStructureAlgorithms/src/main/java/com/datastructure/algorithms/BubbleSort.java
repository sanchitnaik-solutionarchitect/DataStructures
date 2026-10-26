package com.datastructure.algorithms;

public class BubbleSort {
    public static int[] sort(int[] arr){

        if(arr==null || arr.length == 0)
            return arr;

        for(int i = 0; i < arr.length; i++){
            int temp;
            boolean isSwapped = false;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }

            if(!isSwapped)
                return arr;
        }
        return arr;
    }
}
