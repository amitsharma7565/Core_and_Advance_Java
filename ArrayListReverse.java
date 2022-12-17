// reverse the list
import java.util.*;

class ArrayListReverse{
  public static void main(String args[]){
    ArrayList<String> a=new ArrayList<String>();
    a.add("Amit");
    a.add("Sharma");
    a.add("Vishal");
    a.add("Sachin");
    System.out.println(a);
    Collections.reverse(a);
    System.out.println(a);
  }
}