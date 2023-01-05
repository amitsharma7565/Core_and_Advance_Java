/* 3.Write a program to create custom exception to validate mobile number. Create InvalidMobileNumber and throw this exception 
   whenever user enters the mobile number by not following the below conditions.

  ==> mobile number should contain only digits.
  ==> mobile number should contain only 10 digits.
  ==> mobile number should start with 9 or 8 or 7 or 6.

  Sample input: 
  Enter your mobile number: 4565333953
  Sample output: java.lang.InvalidMobileNumber: "Invalid mobile number"

  Sample input: 
  Enter your mobile number: 9884533953
  Sample output: Valid Mobile number
*/

import java.util.*;
import java.io.*;

class invalidMobileNumberException extends Exception {
  public invalidMobileNumberException(String s) {
    super(s);
  }

}

public class InvalidMobileNumber {
  public void mobilenumber() throws invalidMobileNumberException {
    System.out.println("enter mobile number");
    Scanner sc = new Scanner(System.in);
    String mobileno = sc.next();
    if (mobileno.length() != 10) {
      throw new invalidMobileNumberException("mmobile number length is not valid");
    }
    if (mobileno.charAt(0) == '9' || mobileno.charAt(0) == '8' || mobileno.charAt(0) == '7'
        || mobileno.charAt(0) == '6') {
      System.out.println("valid mobile number");
    } else {
      throw new invalidMobileNumberException("Invalid mobile number");
    }
  }

  public static void main(String args[]) {
    InvalidMobileNumber i = new InvalidMobileNumber();
    try {
      i.mobilenumber();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}