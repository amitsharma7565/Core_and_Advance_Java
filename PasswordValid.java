import java.util.*;
class PasswordValid{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the ticket id");
    String s1=sc.nextLine();
    int count=0;
    for(int i=0;i<s1.length();i++){
      if(s1.charAt(i)=='1'||s1.charAt(i)=='2'||s1.charAt(i)=='3'||s1.charAt(i)=='4'||s1.charAt(i)=='5'||s1.charAt(i)=='6'||s1.charAt(i)=='7'||s1.charAt(i)=='8'||s1.charAt(i)=='9'||s1.charAt(i)=='0'){
        count++;
      }
      
    }
    if(count==s1.length()){
      System.out.println("valid");
    }
    else{
      System.out.println("not valid");
    }
  }
}