 package Arrays;


class ImplementArray {

public static void main(String[] args) {

    MyCustomArray myarr = new MyCustomArray(5);

    myarr.insertItem(5);
    myarr.insertItem(9);
    myarr.insertItem(8);
    myarr.insertItem(3);
    myarr.insertItem(1);
    myarr.insertItem(11);
    myarr.insertItem(15);
    myarr.insertItem(19);
    
    

    System.out.println(myarr);

    // myarr.remove(2);

    System.out.println(myarr.max());
    System.out.println(myarr.min());
//   System.out.println(Arrays.toString(myarr.reverseArray()));
myarr.reverseArray2();
 System.out.println(myarr);

    
}

}


 class MyCustomArray {
    private int[] items ;
    private int currentIndex = 0;

    
    public MyCustomArray(int InitialSize){
        this.items = new int[InitialSize];
    }

    // Insert a item and dynamic array
    public  void insertItem (int a) {

        if(currentIndex== items.length) {
            int [] tempArr = new int[items.length*2];
            for(int i=0; i<currentIndex; i++) {
                tempArr[i] = items[i];
            }
            items = tempArr; 
        }
        this.items[currentIndex] = a; 
        currentIndex++;

    }

    //Print  array.
    public String toString () {
      StringBuilder str  = new StringBuilder();

      str.append("[");

      for(int i=0; i<currentIndex; i++) {
          str.append(this.items[i]+", ");
      }
      str.append("\b").append("\b").append("]");
      return str.toString() ;

    }

    //method to do linear search in array
    public int findIndexByValue (int a) {
        
        for( int i=0; i<currentIndex; i++) {
            if(this.items[i] == a ) {
                return i;
            }
        }
        return -1;


    }
 

    //remove element by index
public void remove(int a) {
    if (a < 0 || a >= currentIndex) {
        throw new IndexOutOfBoundsException("Invalid index: " + a);
    }


    for(int i=a; i<=currentIndex-2; i++) {
        this.items[i] = this.items[i+1] ;
       }
    
       currentIndex--;  
 

 }


 //find max element
 public int max(){
    int res = 0;

    for(int i=0; i<currentIndex; i++) {
         if(res<this.items[i]) {
            res = this.items[i];
         }
    }

    return res;
 }

 //find min element
 public int min(){
    int res = this.items[0];

    for(int i=1; i<currentIndex; i++) {
         if(res>this.items[i]) {
            res = this.items[i];
         }
    }

    return res;
 }


 //reverse and return new array

 public  int[] reverseArray() {
    int[] resArr = new int[currentIndex];
    for(int i=0; i<currentIndex; i++) {
      resArr[i] = this.items[currentIndex - 1 - i];

    }
    return resArr;
 }

  //reverse an original array

  public  void reverseArray2() {
    for(int i=0; i<currentIndex/2; i++) {
        this.items[i] = this.items[currentIndex - 1 - i];

    }
 }
}