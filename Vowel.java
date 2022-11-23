import java.util.*;
class Vowel{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=s.next();
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=="a"||str.charAt(i)=="e"||str.charAt(i)=="i"||str.charAt(i)=="o"||str.charAt(i)=="u"){
        System.out.println("Vowels is: "+str.charAt(i));
      }
    }
  }
}