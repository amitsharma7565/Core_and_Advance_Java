import java.util.*;

class Digit {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    if (num >= 0&& num<=9) {
      System.out.println("Digit");
    } else
      System.out.println("not Digit");
  }
}