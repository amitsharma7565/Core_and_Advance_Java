import java.util.*;
class LastWordLength{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String str=sc.nextLine();
    String str2[]=str.split(" ");
    String FirstDigit=str2[0];
    int firstWord=FirstDigit.length()-1;
    int lastDigit=str2.length-1;
    int diff= firstWord-lastDigit;
    System.out.println("Difference between is"+ diff);
  }
}