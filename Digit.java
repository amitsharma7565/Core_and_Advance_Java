// check whether character is digit or not?
import java.util.*;
class Digit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Digit");
    char num=sc.next().charAt(0);
    if(num>='0'&&num<='9'){
      System.out.println("digit");
    }
    else{
      System.out.println("not digit");
    }
  }
}