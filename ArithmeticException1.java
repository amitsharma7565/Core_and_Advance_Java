/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException1 {
  public static void ArithmeticExce(int a,int b){
    
    try{
      // ArithmeticException will occur
      int c=a/b;
      System.out.println(c);
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }

  }
    public static void main(String args[]) {
      ArithmeticExce(10,0);
    }
}