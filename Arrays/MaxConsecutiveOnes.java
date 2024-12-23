package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[]  arr = new int[]{1,0,1,1,1,0,1};

        int count = 0; 
        int max_count = 0;

        for(int i:arr){
            if(i == 1) {
                count++;
            }
            else {
                count = 0;
            }
            if(max_count<count) max_count = count;
        }

        System.out.println(max_count);

    }
}
