/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;
public class NumberFormatException {
  public static void test(int a,int b){
    System.out.println(a+b);
  }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the values");
      String num1=sc.next();
      String num2=sc.next();
      int c,d;
      c=Integer.parseInt(num1);
      d=Integer.parseInt(num2);
      try{
        // NumberFormatException will occur
        test(c,d);
      }
      catch(Exception e){
        System.out.println(e);
      }
      
    }
}
