
import java.util.Scanner;

class Bonanza {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The 1st card number");
    int x = sc.nextInt();
    System.out.println("Enter The 2nd card number");
    int y = sc.nextInt();
    System.out.println("Enter The 3rd card number");
    int z = sc.nextInt();
    System.out.println("Enter The 1st card name");
    char a = sc.next().charAt(0);
    System.out.println("Enter The 2nd card name");
    char b = sc.next().charAt(0);
    System.out.println("Enter The 3rd card name");
    char c = sc.next().charAt(0);
    if ((x == y && y == z && z == x) && (a == b && b == c && c == a))
      System.out.println("Double Bonanza");
    else if ((x == y && y == z && z == x) || (a == b && b == c && c == a))
      System.out.println("Bonanza");
    else
      System.out.println("No Bonanza");
  }
}