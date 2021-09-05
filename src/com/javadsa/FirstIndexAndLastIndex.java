package com.javadsa;
import java.io.*;
import java.util.*;

public class FirstIndexAndLastIndex{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int firstNumber = -1;
        while(low <= high){
            int mid = (low + high) / 2 ;
            if(target < arr[mid]){
                high = mid - 1;

            }else if(target > arr[mid]){
                low = mid + 1;
            }else{
                firstNumber = mid;
                high = high - 1;
            }
        }
        System.out.println(firstNumber);


        low = 0;
        high = arr.length - 1;
        int lastNumber = -1;
        while(low <= high){
            int mid = (low + high) / 2 ;
            if(target < arr[mid]){
                high = mid - 1;

            }else if(target > arr[mid]){
                low = mid + 1;
            }else{
                lastNumber = mid;
                low = low + 1;
            }
        }
        System.out.println(lastNumber);
    }

}
