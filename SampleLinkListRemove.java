import java.util.*;
class SampleLinkListRemove{
  public static void main(String args[]){
    LinkedList<String> a=new LinkedList<String>();
    a.add("Ravi0");
    a.add("Ravi1");
    a.add("Ravi2");
    a.add("Ravi3");
    a.add("Ravi4");
    a.add("Ravi5");
    System.out.println(a);
    // remove specific element
    a.remove("Ravi1");
    System.out.println(a);
    // remove element base on the position
    a.remove(2);
    System.out.println(a);
    //Create a anothe linkedList
    LinkedList<String> a2=new LinkedList<String>();
    a2.add("Sharma1");
    a2.add("Sharma2");
    a2.add("Sharma3");
    // adding to the frist List
    a.addAll(a2);
    System.out.println(a);
    // remove all new element from the list
    a.removeAll(a2);
    System.out.println(a);
    // remove the first element fromt the list
    a.removeFirst();
    System.out.println(a);
    // remove last
    a.removeLast();
    System.out.println(a);
    // remove by occurance
     a.removeFirstOccurrence("Ravi2"); 
    System.out.println(a);
    a.add("Amit");
    a.add("Sharma");
    a.add("Thakur");
    a.add("Amit");
    a.add("Kapoor");
    a.removeLastOccurrence("Amit");
    System.out.println(a);
    // clear all
    a.clear();
    System.out.println(a);
}
}