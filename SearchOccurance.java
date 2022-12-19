// WAP to search all occurrences of a character in given string.
import java.util.*;
class SearchOccurance{
  public static void searchOccurance(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    System.out.println("Enter the charcter");
    char ch=sc.next().charAt(0);
    // for loop
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==ch){
        System.out.println(ch+"is aviavle at the position "+i);
      }
    }
  }
  public static void main(String args[]){
    SearchOccurance.searchOccurance();
  }
}