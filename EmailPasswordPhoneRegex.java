import java.util.regex.*;
// amit123@gmail.
// amit@123
class EmalRegex{
  public static void main(String args[]){
    // for email
    System.out.println(Pattern.matches("[a-z 0-9]+[@][a-z]+[.][a-z]{2,3}", "amitsharma7565@gmail.com"));
    // for password
    System.out.println(Pattern.matches("[A-Z][a-z]{3}[\\W][0-9]+","Amit@123"));
    // for mobile number
    // 8894181261
      System.out.println(Pattern.matches("[0-9]+","8894181261"));
  }
}