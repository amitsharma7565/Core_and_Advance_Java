// addAll
import java.util.*;
class ArrayList14Product{
  public static void main(String args[]){
  ArrayList<String>a=new ArrayList<String>();
  a.add("a");
  a.add("b");
  a.add("c");
  a.add("d");
// System.out.println(a);
    ArrayList<String> a1=new ArrayList<String>();
    a1.addAll(a);
    System.out.println(a1);
    System.out.println(a1.get(2));
    
  }
}