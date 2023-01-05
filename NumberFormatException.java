/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/
import java.util.*;
public class NumberFormatException {

    public static void main(String args[]) {
      long mobileNumberSum=0;
      int fNamecount=0;
      int lNamecount=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the First name");
      String fName=sc.next();
      System.out.println("Enter the Last name");
      String lName=sc.next();
      for(int i=0;i<fName.length();i++){
        fNamecount++;
      }
      System.out.println("Number of characters in firstName : "+fNamecount);

      for(int i=0;i<lName.length();i++){
        lNamecount++;
      }
      System.out.println("Number of characters in lastName : "+lNamecount);
      
      System.out.println("Enter the Mobile number");
      String mobileNumber=sc.next();
    // int mNum=Integer.parseInt(mobileNumber);
      try{
        // Handle NumberFormatException while converting mobileNumber to long.
      long mNum=Long.parseLong(mobileNumber); 
      while(mNum>0){
        long rem=mNum%10;
        mobileNumberSum=mobileNumberSum+rem;
        mNum=mNum/10;
      }
      System.out.println("sum of digits of a mobileNumber"+mobileNumberSum);
    }
    catch(Exception e){
      System.out.println(e);
    }
    }
}