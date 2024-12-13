package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    
    public static void main(String[] args) {

        int[] nums = new int[] {2,11,7,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumBruteforce(nums, target)));
        System.out.println(Arrays.toString(twoSumOptimal(nums, target)));
     
        
    }
    //bruteforce method : Time- O(n^2) , Space - O(1)
    public  static int[] twoSumBruteforce(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0; i<nums.length-1; i++) {
          
          for (int j=i+1; j<nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                res[0] = i;
                res[1] = j;
                return res; 
            }
          }
        }

        return res;
    }


    //optimal solution using hashmap: Time - O(n) , space - o(1)
    public  static int[] twoSumOptimal(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int targetValue = target - nums[i];
            if(sumMap.containsKey(targetValue)) {
                return new int[] {sumMap.get(targetValue), i};
            }
            sumMap.put(nums[i], i);
        }

        return new int[] {};
    }
}


