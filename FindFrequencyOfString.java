import java.util.*;
class FindFrequencyOfString{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String");
    String str= sc.nextLine();
    str=str.toLowerCase();
    for(char ch='a';ch<='z';ch++){
      int count=0;
      for(int i=0;i<str.length();i++){
        if(ch==str.charAt(i)){
          count++;
        }
      }
      if(count!=0){
         System.out.println(ch+" "+count);
      }
     
    }
   
  }
}