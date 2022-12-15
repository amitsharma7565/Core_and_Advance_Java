// Create a class Main and in the main method get the usernames and store them in an ArrayList. After getting all the names, just display them in the same order.
import java.util.*;
class ArrayList5Product{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<String> a=new ArrayList<String>();
    System.out.println("Enter the username 1");
    a.add(sc.next());
    System.out.println("Enter the username 2");
    a.add(sc.next());
    System.out.println("Enter the username 3");
    a.add(sc.next());
    // System.out.println(a);
    for(Object obj:a){
      System.out.println(obj);
    }
  }
}
