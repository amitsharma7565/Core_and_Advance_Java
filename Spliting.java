/* JFM1T11_Assignment6:

   Write a program to sort an array containing alphabets, special symbols and numbers.
   Prompt the user input from the terminal.
   
   Sample Input: bit01$$Lab02s03!@!!
   
   Expected Output: 
   Characters: bitLabs
   Numbers: 010203
   Special characters: $$!@!!

*/

import java.util.Scanner;

public class Spliting
{ 

    //main method
    public static void main (String[] args)
    {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str  = sc.nextLine();
        //call splitString method
        splitString(str);
    }
        //create splitString method in that initialize alpha, num and special to stringBuffer
        static void splitString(String str)
        { 
            //created StringBuffer with object alpha
            StringBuffer alpha = new StringBuffer();
            //created StringBuffer with object num
        	StringBuffer num = new StringBuffer();
            //created StringBuffer with object special
            StringBuffer special = new StringBuffer();
        	//check if the entered string is digit,alpha and special using if condition
            for (int i=0; i<str.length(); i++)
            {
                //checking character is digit or not by using isDigit() method
                if (Character.isDigit(str.charAt(i)))//
                {
                    //appending num with charAt(i)
                    num.append(str.charAt(i));
                }
                //checking character is  Alphabetic or not by using isAlphabetic() method
            	else if(Character.isAlphabetic(str.charAt(i)))
                {
                    //appending alpha with charAt(i)
                	alpha.append(str.charAt(i));
                }
                //checking character is special character or not 
                else
                {
                    //appending special with charAt(i)
                	special.append(str.charAt(i));
                }
                   
                
            }
                //printing seperatly characters in character, numbers in number and special characters in special character
                //prints seperate alphabits
                System.out.println("\nAlphabits          : "+alpha);
                //prints seperate numbers
           		System.out.println("Numbers            : "+num);
           		//prints seperate special characters
           		System.out.println("Special Characters : "+special);
        }            
        
    
}
        	