package Arrays;
import java.util.Arrays;

public class SortAndMergeTwoArray {


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 4};
        int[] arr2 = {6, 2, 3, 9};
        
        sortArray(arr1);
        sortArray(arr2);
        
        // System.out.println(Arrays.toString(arr1) + " sorted");
        // System.out.println(Arrays.toString(arr2) + " sorted");
        
        int[] mergedArr = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArr));
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j] && i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] finalArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] >= arr2[j]) {
                finalArr[k] = arr1[i];
                i++;
            } else {
                finalArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            finalArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            finalArr[k] = arr2[j];
            j++;
            k++;
        }

        return finalArr;
    }
}


