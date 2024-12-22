package Arrays;
import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,11,6,5,3,2,3};
       

        System.out.println(largest(arr));
        System.out.println(largestRecursive(arr,  0, 0));

        
    }

    //bruteforce approach
    public static int largest(int[] arr) {
        int res = 0;
        for(int i:arr) {
            if(i > res) {
                res = i;
            }
        }
        
        return res;
    }


//recursive approach
public static int largestRecursive(int[] arr,  int res, int index) {
    int len = arr.length;
    if(len==index) return res; 

    if(res<arr[index]) res = arr[index];
    
     return largestRecursive(arr,res,index+1);
  
}

}