// copy one list to another list
import java.util.*;
class ArrayList15Product{
  public static void main(String args[]){
  ArrayList<String>a=new ArrayList<String>();
  a.add("a");
  a.add("b");
  a.add("c");
  a.add("d");
// System.out.println("List 1 is :"+a);
    ArrayList<String> a1=new ArrayList<String>();
    a1.add("e");
    a1.add("f");
    a1.add("g");
    a1.add("i");
    // System.out.println("List 2 is :"+a1);

    Collections.copy(a1,a);
    System.out.println(a1);
    // System.out.println(a1);

    
  }
}