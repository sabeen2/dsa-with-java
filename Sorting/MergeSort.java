package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 1, 4, 6, 9, 3, 10, 2};
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSortAlgo(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void mergeSortAlgo(int[] arr) {
        int len = arr.length;

        if (len < 2) return; // Base case: array is already sorted.

        int mid = len / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, len);

        // Recursive sorting of left and right halves
        mergeSortAlgo(leftArr);
        mergeSortAlgo(rightArr);

        // Merging sorted halves
        mergeArray(arr, leftArr, rightArr);
    }

    public static void mergeArray(int[] arr, int[] leftArr, int[] rightArr) {
        int left = leftArr.length;
        int right = rightArr.length;

        int i = 0, j = 0, k = 0;

        // Merge leftArr and rightArr into arr
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from leftArr (if any)
        while (i < left) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements from rightArr (if any)
        while (j < right) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
