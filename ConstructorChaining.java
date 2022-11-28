/* JFM1T10_Assignment1:

   Write a program to demonstrate Constructor chaining in Java 
   Add atleast 3 constructors

   Sample Output:
   Parent class default constructor
   Child class default constructor
   Parent class one-argument constructor
   Child class one-argument constructor

*/

class parent {
  // default constructor
  parent()
  {
     System.out.println("Parent class default constructor");
  }
  // one-argument constructor
  parent(int x)
  {
     System.out.println("Parent  class one-argument constructor");
  }
}
class child extends parent{
   child()
   {
      System.out.println("child class default constructor");
   }
   child(int x)
   {
      super(10);
      System.out.println("Child class one-argument constructor");
   }
}
public class ConstructorChaining
{
   public static void main(String args[])
   {
      new child();
      new child(10);
   }
   }

