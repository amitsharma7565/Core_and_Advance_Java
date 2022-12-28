 /* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers using next() method of scanner class. Convert into numerical values and print addition of two numbers.
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;
class ExceptionHandlingAssignment2{
   public static void test(int a,int b){
     System.out.println(a+b);
   }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the parametrs");
    String a=sc.next();
    String b=sc.next();
    int p,q;
    // NumberFormatException
    p=Integer.parseInt(a);
    q=Integer.parseInt(b);
    test(p,q);
  }
}