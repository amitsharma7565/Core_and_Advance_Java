// check whether character is alphabet or not?
import java.util.*;
class Alphabet{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the charcter");
    char ch=sc.next().charAt(0);
    if((ch>='a'&&ch<='z')||(ch>='A'&&ch<'Z')){
      System.out.println(ch+"is a alphabet");
    }
    else{
      System.out.println(ch+"is not a alphabet");
    }
  }
}