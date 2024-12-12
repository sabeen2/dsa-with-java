 package Arrays;

class ImplementArray {

public static void main(String[] args) {

    MyCustomArray myarr = new MyCustomArray(5);

    myarr.insertItem(5);
    myarr.insertItem(9);
    myarr.insertItem(8);
    myarr.insertItem(3);
    myarr.insertItem(1);

    System.out.println(myarr);

    myarr.remove(2);

    System.out.println(myarr);
    
}

}


 class MyCustomArray {
    private int[] items ;
    private int currentIndex = 0;

    
    public MyCustomArray(int InitialSize){
        this.items = new int[InitialSize];
    }

    // Insert a item
    public  void insertItem (int a) {
        this.items[currentIndex] = a; 
        currentIndex++;

    }

    //Print  array.
    public String toString () {
      StringBuilder str  = new StringBuilder();

      str.append("[");

      for(int i: this.items) {
          str.append(i+", ");
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
 
public void remove(int a) {

   for(int i=a; i<=currentIndex-2; i++) {
    this.items[i] = this.items[i+1] ;
   }

   currentIndex--;  
   this.items[currentIndex] = 0; 

 }

}