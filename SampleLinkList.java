import java.util.*;

class SampleLinkList {
  public static void main(String args[]) {
    LinkedList<String> a = new LinkedList<String>();
    a.add("Ravi");
    a.add("Thakur");
    a.add("Sonam");
    System.out.println("After invoking add(E e) method: " + a);
    // Adding element at sepcific postion
    a.add(1, "Amit");
    System.out.println("After invoking add(int index, E element) method: " + a);
    // crerate the second linkList
    LinkedList<String> a2 = new LinkedList<String>();
    a2.add("Sharma");
    a2.add("negi");
    System.out.println(a2);
    // second list add to First List
    a.addAll(a2);
    System.out.println("After adding the element to the first list " + a);
    // create the third LinkList element
    LinkedList<String> a3 = new LinkedList<String>();
    a3.add("Arupam");
    a3.add("Abhishek");
    a2.addAll(1, a3);
    System.out.println("job " + a2);
    a2.addFirst("Amit");
    System.out.println("job " + a2);
    a2.addLast("harsh");
    System.out.println(a2);

  }
}