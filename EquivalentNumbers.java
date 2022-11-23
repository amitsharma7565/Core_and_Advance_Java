/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   
*/
import java.util.Scanner;
public class EquivalentNumbers {                                     

//Main method
  public static void main(String []args)
{
    EquivalentNumbers obj=new EquivalentNumbers();
}
//initialize Convert class constructor
  EquivalentNumbers()
{
//create Scanner object
  Scanner sc = new Scanner(System.in);
//take input from user
  System.out.print("Enter value : ");
  Convert c=new Convert();
   c.setValue(sc.nextInt());
   int value=c.getValue();
//convert numbers into hexa,octal and binary
  System.out.println("Binary equivalent : "+Integer.toBinaryString(value)+" "+"Octal equivalent: "+Integer.toOctalString(value)+" "+"Hexadecimal   equivalent:"+Integer.toHexString(value));
}

}
//create Convert class in that declare variables
  class Convert
{
  int value;

    //add getters and setters method
    public void setValue(int value)   
    {
        this.value = value;        
    }
    public int getValue()
    {
     return value;
    }

}
