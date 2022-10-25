import java.util.*;

class Negative {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    if (num < 0) {
      System.out.println("its a Negative number");
    } else
      System.out.println("its not a Negative number");
  }
}