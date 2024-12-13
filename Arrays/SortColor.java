package Arrays;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = new int[] {0,1,1,2,0,2};

      
        System.out.println(Arrays.toString(sortColorBruteForce(nums)));
        sortColorOptimal(nums);
        System.out.println(Arrays.toString(nums));

    }


    // bruteforce method: Time - o(2*N) = o(n) , Space: o(n)
    public static int[] sortColorBruteForce(int[] nums) {

        int zeros = 0;
        int ones = 0;
        int twos= 0;
        int[] res = new int[nums.length]; 
        int index = 0;

        for(int i : nums) {
            if(i == 0) {
                zeros++;
            }
            else if(i == 1) {
                ones++;
            }
            else if(i == 2 ) {
                twos++;
            }
        }

        while(zeros>0) {
            res[index] = 0;
            index++;
            zeros--;
        }

        while(ones>0) {
            res[index] = 1;
            index++;
            ones--;
        }

        while(twos>0) {
            res[index] = 2;
            index++;
            twos--;
        }
        
        return res;
        
        


    }


    // optimal way - two pointer approach -  one one pass : Time - o(n) 
    public static void sortColorOptimal(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int i = 0;

        while (i <= end) {
            if (nums[i] == 0) {
              
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                i++;
                start++;
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                
                int temp = nums[end];
                nums[end] = nums[i];
                nums[i] = temp;
                end--;
            }
        }
    }

}
