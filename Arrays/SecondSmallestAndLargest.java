package Arrays;

public class SecondSmallestAndLargest {

     public static void main(String[] args) {
        int[] arr = new int[] {6,1,9,5,3,11,19};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i: arr) {
            if(i>largest) {
                largest = i;
            }
            if(i<smallest) {
                smallest = i;
            }
        }

        for(int j : arr) {
            if(j>secondLargest && j != largest) {
                secondLargest = j;
            }
            if(j<secondSmallest && j !=smallest) {
                secondSmallest = j;
            }
        }



    System.out.println(largest + " largest"); 
    System.out.println(smallest + " smallest"); 
    System.out.println(secondLargest + " secondLargest"); 
    System.out.println(secondSmallest + " secondSmallest"); 
    
    }
}