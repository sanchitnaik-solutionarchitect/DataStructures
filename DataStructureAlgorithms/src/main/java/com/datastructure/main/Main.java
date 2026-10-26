package com.datastructure.main;

import com.datastructure.algorithms.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,1,6,3,8,2,9,3,0};
        int[] sortedArray = BubbleSort.sort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(sortedArray[i]);
        }
    }
}