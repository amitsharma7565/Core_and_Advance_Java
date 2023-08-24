// Original String : w3resource.com 
// find the unicode 

import java.util.Scanner;
class FindUnicode{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String str="My name is Amit Sharma";
    int strLength=str.length();
    System.out.println("Enter the index between 0 to "+strLength);
    int unicode= str.codePointAt(sc.nextInt());
    System.out.println(unicode);
  }
}