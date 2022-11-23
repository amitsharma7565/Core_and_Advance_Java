/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {
  //main method
public static void main(String args[])
{
  //declare varible
    String a,b="";
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string: ");
  //take input from user
    a=s.nextLine();
    int n=a.length();
    for(int i=n-1;i>=0;i--)
    {
        b=b+a.charAt(i);
    }
   // If both are equal then it is a palindrome else print it is not a palindrome 
    if(a.equalsIgnoreCase(b))
    {
        System.out.println("Malayalam is a Palindrome");
    }
    else
    {
        System.out.println("Malayalam is not a Palindrome");
    }
}

}