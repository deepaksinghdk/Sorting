package com.javadsa;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
         int[] arr = {-47,-62,-10,-1,0,2,99,43,55,11,-402};
         SortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SortedArray(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 1; j < arr.length - i ; j++){
                //swap if the item is smaller than the previous items
                if (arr[j] < arr [j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                }
                }
            }
        }
    }
