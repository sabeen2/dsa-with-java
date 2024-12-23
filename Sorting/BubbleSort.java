package Sorting;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = new int[]{7,8,3,1,2};

  System.out.println(  Arrays.toString(bubbleSortRecursion(arr, arr.length)));
    
  }

  //Bubble sort algo : Time - O(n^2) 
  public static int[] bubbleSortAlgo (int[] arr ) {

   for(int i=0; i<arr.length-1; i++) {
        for(int j=0; j<arr.length-i-1; j++) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

        }
   }
   return arr;
  }


  //bubble sort with recursion

  public static int[] bubbleSortRecursion(int[] arr, int num) {

    if(num<=1) {
        return arr;
    }

    for(int i=0; i< num- 1 ; i++) {
       if(arr[i]> arr[i+1]) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
       }
    }

    return bubbleSortRecursion(arr, num-1);

  }

 
}
