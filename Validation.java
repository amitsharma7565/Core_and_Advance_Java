import java.util.*;
class Validation{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
  System.out.println("Enter the Email");
    String email= sc.next();


    // this is for to check the first alphabet is capitial or not 
   boolean FirstChar= Character.isUpperCase(email.charAt(0));

    boolean alphabet =false;
    boolean digit=false;

    // this logical for alphabet
 for(int i=0;i<email.length();i++){
     char ch=email.charAt(i);
      if(ch>='a'&&ch<='z'){
         alphabet =true;
      }
      
   
 }
// this logical for digt
 for(int i=0;i<email.length();i++){
     char ch=email.charAt(i);
      if(ch>='0'&&ch<='9'){
         digit =true;
      }
   
 }
  
    if(FirstChar && alphabet && digit){
      System.out.println("yes valid");
    }
    else{
      System.out.println("Its not a valid");
    }
  
  }
}

