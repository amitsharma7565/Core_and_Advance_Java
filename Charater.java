
// Write a JAVA program to input any character and check whether it is alphabet, digit    or special character.
import java.util.Scanner;

class Charater {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any character");
    char ch = s.next().charAt(0);
    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      System.out.println("its a alphabet");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println("Its a digit");
    } else
      System.out.println("its a Special character");
  }
}