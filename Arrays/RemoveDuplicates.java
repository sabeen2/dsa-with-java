package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
        public static void main(String[] args) {
            int[] arr = new int[] {0,0,1,1,1,2,2,3,3,4};
            System.out.println(removeDuplicates(arr));
        }

            //Two pointers method
         public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; 
        }

        int index = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index; 
    }
}
