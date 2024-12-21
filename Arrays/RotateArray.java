package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main (String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        // int[] nums = new int[] {-1,-100,3,99 };
        int k = 3;
        int end = nums.length-1;
        k = k % nums.length;


       reverse(nums, 0, end);
       reverse(nums, 0, k-1);
       reverse(nums, k, end);
    
        
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int left , int right) {
        while(left < right) {
            int temp =  nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right --;
        }
    }
}
