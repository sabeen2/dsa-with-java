package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 3, 1, 2};

        // System.out.println(Arrays.toString(selectionSortAlgo(arr)));
        System.out.println(Arrays.toString(selectionSortRecursiveAlgo(arr, 0)));
    }

    // Selection sort algorithm : Time - O(n^2) 
    public static int[] selectionSortAlgo(int[] arr) {
        for(int i=0; i<arr.length-1; i++ ) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++ ) {
                if(arr[minIndex] > arr[j] ) {
                    minIndex = j;
                }
            }

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
              
    }
    return arr;

}


       // Selection sort with recursion
        public static int[] selectionSortRecursiveAlgo(int[] arr ,  int num) {

            if(num >= arr.length) {
                return arr;
            }
            int minIndex = num;

            for(int i = num+1; i<arr.length ; i++) {
                if(arr[minIndex] > arr[i] ) {
                    minIndex = i;
                }
            }

              int temp = arr[num];
                arr[num] = arr[minIndex];
                arr[minIndex] = temp;

                
                return selectionSortRecursiveAlgo(arr,  num+1);
            

        } 

        
}
