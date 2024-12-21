
package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;

        int index = m+n-1;
        int pointer1 = m-1;
        int pointer2 = n-1;

        while (pointer1 >= 0 || pointer2 >= 0) {
            if (pointer1 >= 0 && (pointer2 < 0 || nums1[pointer1] > nums2[pointer2])) { 
                nums1[index] = nums1[pointer1];
                pointer1--;
            
            } 
            else{
                nums1[index] = nums2[pointer2];
                pointer2--;
               
            }
            index--;
           
          }



System.out.println(Arrays.toString(nums1));
    }
}

