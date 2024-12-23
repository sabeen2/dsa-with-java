package Arrays;

public class SecondSmallestAndLargest {

     public static void main(String[] args) {
        int[] arr = new int[] {6,1,9,5,3,11,19};
        // secondSmallestAndLargest(arr);
        secondSmallestAndLargestOptimal(arr);
    
    }


    //bruteforce approach : Time - 0(n) + O(n) = O(n)
    public static void secondSmallestAndLargest(int[] arr) {
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

//Optimal apporoach in single traverse: Time - O(n)
public static void secondSmallestAndLargestOptimal(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int secondLargest= Integer.MIN_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for(int i : arr) {
        if(i < smallest ) {
            secondSmallest = smallest;
            smallest = i;
           
        }
        else if(i<secondSmallest) {
            secondSmallest = i;
        }
        if(i>largest) {
            secondLargest = largest;

            largest  = i;
        }
        else if(i>secondLargest) {
            secondLargest = i;
        }
    }

    System.out.println(largest + " largest"); 
    System.out.println(smallest + " smallest"); 
    System.out.println(secondLargest + " secondLargest"); 
    System.out.println(secondSmallest + " secondSmallest"); 
}


}

