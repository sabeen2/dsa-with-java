package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfSortedArrays {

     public static void main(String[] args) {
         int[] a = new int[]{1, 2, 3, 4, 5};
         int[] b = new int[]{1, 2, 3, 6, 7};
         System.out.println(findUnion(a,b));
     }

      public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> mySet = new HashSet<>(); 
        ArrayList<Integer> myArr = new ArrayList<>();
        for(int i:a) {
            mySet.add(i);
        }
        for(int j:b) {
            mySet.add(j);
        }
        
        for(int i : mySet) {
            myArr.add(i);
        }
        
        return myArr;
    }

     
}

