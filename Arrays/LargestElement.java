package Arrays;
import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,11,6,5,3,2,3};

        System.out.println(largest(arr));

        
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
}
