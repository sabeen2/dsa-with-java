package Arrays;

public class SortedOrRotated {
    public static void main(String[] args) {
    int[] nums = new int[]{3,4,5,1,2};
    int[] nums1 = new int[]{2,1,3,4};


    System.out.println(isSortedOrRotated(nums1));

    
    }

    public static boolean isSortedOrRotated(int nums[]){
        int count = 0;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                count++;
                
            }
            System.out.println(nums[i]  + "," + nums[i+1]);
        }
        if(nums[nums.length-1] > nums[0]) count++;
        if(count>1) {
            return false;
        }
        else{
            return true;
        }
    }
}
