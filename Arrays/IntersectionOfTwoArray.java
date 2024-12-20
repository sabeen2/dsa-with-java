package Arrays;

import java.util.Arrays;
import java.util.HashSet;

class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersectionOfArray(nums1, nums2)));
    }


    // implementation using hashset
    public static int[] intersectionOfArray(int[] nums1, int[] nums2) {
        HashSet<Integer> mySet = new HashSet<>();
        int[] res = new int[Math.min(nums1.length , nums2.length)]; 
        int index = 0;
        
        for(int i:nums1) {
            mySet.add(i);
        }

        for(int j : nums2 ) {
            if(mySet.contains(j)) {
                res[index] = j;
                mySet.remove(j);
                index++;
            }
        }

        return Arrays.copyOf(res, index);
    }
}
