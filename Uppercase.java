
//  Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
import java.util.*;

class Uppercase {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Character");
    char ch = s.next().charAt(0);
    if ((ch >= 'a') && (ch <= 'z')) {
      System.out.println("this is lowercase Character");
    } else if ((ch >= 'A') && (ch <= 'Z')) {
      System.out.println("This is Uppercase charcter");
    } else
      System.out.println("Invalid input");
  }
}