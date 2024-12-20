package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 3, 1, 2};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { 
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                    
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
