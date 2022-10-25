
// 1.Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;

class Vowel {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Alphabet");
    char ch = s.next().charAt(0);
    if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E')
        || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
      System.out.println("Its a Vowel");
    } else
      System.out.println("Its a consonant");
  }
}