
/*  JFM1T13_Assignment4: 

      Write a program to create a class HDTV with the properties: 
         •	Brandname 
         •	Size 
      Create another class having an ArrayList and add 3 objects of HDTV into it. Display HDTV objects in sorted order of size.(Use Comparator) 

     Sample Output:
     4000 Sony 20
     2000 LG 26
     3000 MI 27
     1000 Samsung 28
*/
import java.util.*;

class HDTV {
  int amount;
  String brandname;
  int size;

  // constructor
  HDTV(int amount, String brandname, int size) {
    this.amount = amount;
    this.brandname = brandname;
    this.size = size;
  }
}

// create BrandnameComparator it implements Comparator in that create a compare
// method pass two parameters for comparing sizes
class BrandnameComparator implements Comparator<HDTV> {
  public int compare(HDTV h1, HDTV h2) {
    // compare sizes and return size
    if (h1.size == h2.size) {
      return 0;
    } else if (h1.size > h2.size) {
      return 1;
    } else {
      return -1;
    }
  }
}

public class HdTvStock {
  // main method
  public static void main(String args[]) {
    // create HdTv class object in arraylist
    ArrayList<HDTV> arr = new ArrayList<HDTV>();
    // add elements to that arraylist
    arr.add(new HDTV(3000, "MI", 27));
    arr.add(new HDTV(4000, "Sony", 20));
    arr.add(new HDTV(1000, "Samsung", 28));
    arr.add(new HDTV(2000, "LG", 26));
    // use collection.sort and pass Brandname Comparator as parameters
    Collections.sort(arr, new BrandnameComparator());
    // print values on sorted order based on size value
    for (HDTV obj : arr) {
      // print result
      System.out.println(obj.amount + " " + obj.brandname + " " + obj.size);
    }
  }
}
