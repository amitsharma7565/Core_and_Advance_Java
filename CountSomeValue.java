import java.util.*;
class CountSomeValue{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    str=str.toLowerCase();
    System.out.println("Enter the char you want to search");
    char ch= sc.next().charAt(0);
    int count=0;
    for(int i=0;i<str.length();i++){
     if(str.charAt(i)==ch){
       count++;
     }
    }
    System.out.println(ch+"is"+count);
  }
}