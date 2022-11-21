/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

import java.util.Scanner;

public class Mean {

   public float meanValue(int num1,int num2,int num3){
      float m=((num1+num2+num3)/3);

      return m;
   }


//main method
public static void main(String [] args)
{
//declare variables and initialize sum=0
int sum=0;
int num1,num2,num3;
//create scanner object
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number:");
num1=sc.nextInt();
System.out.println("Enter 2nd number:");
num2=sc.nextInt();
System.out.println("Enter 3rd number:");
num3=sc.nextInt();
//take input from user

//check the for loop for number of values entered in input

//calculate mean
Mean m=new Mean();
System.out.println(m.meanValue(num1,num2,num3));

//print result
}
}