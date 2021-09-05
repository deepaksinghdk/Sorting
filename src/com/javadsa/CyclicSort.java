/*package com.javadsa;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,7,6,3,5,2,4};
        cyclic(arr);
        System.out.println();
        }

    static void cyclic(int[] arr) {
            int i= 0;
            while (i < arr.length){
                int correct = arr[1] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i , correct);
                }else{
                    i++;
                }
            }
        }

    static int swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    return arr[corerct];}
}
*/