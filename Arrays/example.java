package Arrays;

public class example {
    public static void main(String[] args) {
        int[] nums = new int[] {2,1,1,2,3,4,3};

        bruteForceMethod(nums);
        optimalMethod(nums);


    }

    //bruteforce method
    public static void bruteForceMethod(int nums[]) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                if(nums[i] == nums[j])  {
                   
                }
                else {

                }
            }
        }
        
    }




    //optimal method
    public static void optimalMethod(int nums[]) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                if(nums[i] == nums[j])  {
                   
                }
                else {
                    
                }
            }
        }
        
    }


}
