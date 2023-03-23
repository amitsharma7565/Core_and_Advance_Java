import java.util.*;
class CharIsAlphaOrNot{
  public static void  main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the charcter");
    char ch=sc.next().charAt(0);
    if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='a')){
      System.out.println("this is Alphabet");
    }
    else{
      System.out.println("This is not alphabet");
    }
  }
}