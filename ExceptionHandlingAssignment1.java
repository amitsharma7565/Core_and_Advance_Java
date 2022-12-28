/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers.
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/

  class ExceptionHandlingAssignment1{
  public static void Arth(int a,int b){
    System.out.println(a/b);
  }
    public static void main(String args[]){
      try{
        // ArithmeticException will occur 
        Arth(10,0);
      }
      catch(Exception a){
        System.out.println(a);
      }
    }
  }