/* 4. Write a program to create custom exception to validate eligibility score to join in bitLabs. 
      Create InvalidScoreException and throw this exception if user entered score is less than 70.

  Sample input:
  Enter your score to check eligibility:  65

  Sample output: 
  Java.lang.InvalidScoreException: "Sorry, you are not eligible to join in bitLabs."


  Sample input:
  Enter your score to check eligibility:  89

  Sample output: 
  "Great, you are eligible to join in bitLabs."
*/
import java.io.*;
import java.util.*;

class InvalidScoreeException extends Exception {
  public InvalidScoreeException(String str) {
    super(str);
  }
}

public class InvalidScoreException {
  public void Score() throws InvalidScoreeException {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter score");
    int score = sc.nextInt();
    if (score < 70) {
      throw new InvalidScoreeException("Sorry, you are not eligible to join in bitLabs.");
    } else {
      System.out.println("Great, you are eligible to join in bitLabs.");
    }
  }

  public static void main(String args[]) {
InvalidScoreException se=new InvalidScoreException();
    try{
    se.Score();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
