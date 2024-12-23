package Arrays;

import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumberMath(arr));
    }

        //hashmap approach 
     public static int missingNumber(int[] nums) {
        int len = nums.length;
        int res = -1;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i:nums) {
            myMap.put(i,i);
        }

        for(int i=0; i<=len; i++) {
            if(!myMap.containsKey(i)) {
                res = i;
            } 
        }
        return res;

    }


//using mathematical formulae loop
public static int missingNumberMath(int[] nums) { 
    int len = nums.length;
    int sum = len * (len+1)/2 ;
    int sum2 = 0;
   
    for(int i: nums) {
        sum2+=i;
    }
    
    return sum-sum2;
}



}