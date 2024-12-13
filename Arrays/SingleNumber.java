package Arrays;


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[] {2,1,1,2,3,4,3};

       System.out.println( bruteForceMethod(nums) +  ": "  +"using bruteforce ");
        // optimalMethod(nums);

        System.out.println( usingBitwiseOperator(nums)+  ": "  + "using bitwise operator" );

    }

    //bruteforce method using nested loops : Time:O(n^2) Space: O(1)
    public static int bruteForceMethod(int nums[]) {
        for(int i=0; i<nums.length-1; i++) {
            boolean isUnique = true;
            for(int j=0; j<nums.length; j++) {
                if(nums[i] == nums[j] &&  i != j)  {
                    isUnique = false;
                    break;
                }

            }
   if(isUnique) {
    return nums[i];
   }

            

        }

        return -1;
        
        
    }




 


//more optimal solution using bitwise operator : Time:O(n) Space: O(1)
public static int usingBitwiseOperator(int nums[]) { 
  int res = 0; 
  for(int i:nums) {
    res = res^i;
  }
  return res;
}

}
