
/* 1. Write a program to create custom exception to validate password.
      Create InvalidPasswordFormatException and throw this exception
      whenever the user enters the password by not following the below conditions.
      ==> Password should contain at least one digit.
      ==> Password should contain at least one uppercase letter.
      ==> Password should contain at least one lowercase letter.
      ==> Password does not allow space and special characters.

  Sample Input: 
  Enter your password: Password@123
  Sample output: Valid password

  Sample Input: 
  Enter your password: abc123
  Sample output: java.lang.InvalidPasswordFormatException: "Sorry, Invalid passowrd"
*/
import java.util.*;
import java.io.*;

class InvalidPasswordFormateException extends Exception {
  public InvalidPasswordFormateException(String str) {
    super(str);
  }
}

public class InvalidPasswordFormatException {
  public void password() throws InvalidPasswordFormateException {
    Scanner sc = new Scanner(System.in);
    int acount = 0, dcount = 0, scount = 0, lcount = 0;
    System.out.println("enter password");
    String str = sc.next();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        acount++;
      } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        lcount++;
      } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        dcount++;
      } else if (str.charAt(i) == '@' || str.charAt(i) == '&' || str.charAt(i) == '$') {
        scount++;
      }
    }
    if (acount >= 1 && dcount >= 1 && scount >= 1 && lcount >= 1) {
      System.out.println("Valid password");
    } else {
      throw new InvalidPasswordFormateException("Sorry, Invalid passowrd");
    }
  }

  public static void main(String args[]) {
    InvalidPasswordFormatException ip = new InvalidPasswordFormatException();
    try {
      ip.password();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
