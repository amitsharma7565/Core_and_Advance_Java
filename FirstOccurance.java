 // WAP to find first occurrence of a character in a given string.
import java.util.*;
class FirstOccurance{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    System.out.println(str.indexOf("i",2));
  }
}