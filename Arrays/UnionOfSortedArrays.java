package Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfSortedArrays {

     public static void main(String[] args) {
         int[] a = new int[]{1, 2, 3, 4, 5};
         int[] b = new int[]{1, 2, 3, 6, 7};
         System.out.println(findUnionOptimal(a,b));
     }


     //Using treeset and traversing each array
      public static ArrayList<Integer> findUnion(int a[], int b[]) {
        TreeSet<Integer> mySet = new TreeSet<>(); 
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


    //more optimal using two pointers
    static ArrayList<Integer> findUnionOptimal(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0; 
       ArrayList<Integer > myArr=new ArrayList<>(); 
        
       while(i < m && j< n) {
        if(arr1[i] <= arr2[j]) {
           if(myArr.size() == 0 || myArr.get(myArr.size()-1) != arr1[i] ) {
            myArr.add(arr1[i]);
            
           }
           i++;
        }
        else {
            if(myArr.size() == 0 || myArr.get(myArr.size()-1) != arr2[j] ) { 
                myArr.add(arr2[j]);
            }
            j++;
        }
        
       }


       while(i<m) {
        if(myArr.size() == 0 || myArr.get(myArr.size()-1) != arr1[i] ) {
            myArr.add(arr1[i]);
            
           }
           i++;
        }

        while(j<n) {
            if(myArr.size() == 0 || myArr.get(myArr.size()-1) != arr2[j] ) {
                myArr.add(arr2[j]);
                
               }
               j++;
            }
      
      return myArr;
      
        }
      }




