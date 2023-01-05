/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/
import java.util.*;
public class ArithmeticException {

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number");
      int num1=sc.nextInt();
      System.out.println("Enter the second number");
      int num2=sc.nextInt();
      System.out.println("Enter the Arithmetic operator");
      String opr=sc.next();
      // switch cases
      switch(opr){
        case "+":{
          System.out.println(num1+num2);
          break;
        }
         case "-":{
          System.out.println(num1-num2);
          break;
        }
           case "*":{
          System.out.println(num1*num2);
          break;
        }
           case "/":{
             try{
                System.out.println(num1/num2);
             }
             catch(Exception e){
               System.out.println(e);
             }
          break;
        }
        default:{
            System.out.println("Invalid input");
          }
      }
    }
}