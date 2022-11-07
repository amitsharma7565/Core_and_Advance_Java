import java.util.*;

class Distt {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of District");
    int size = s.nextInt();
    String a[] = new String[size];
    System.out.println("Enter the name of the district");
    for (int i = 0; i < a.length; i++) {
      a[i] = s.next();
    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}