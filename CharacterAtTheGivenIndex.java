import java.util.*;
class CharacterAtTheGivenIndex{
public static void main(String args[]){
  String str="Java Exercises!";
  char ch[]= new char[str.length()];
  ch=str.toCharArray();

Scanner sc = new Scanner(System.in);
System.out.println("enter the index number");
int index= sc.nextInt();

try{
  System.out.println("The character at position "+index+ " is "+ch[index]);
}
catch(Exception e){
  System.out.println("number you enter is index out of bound");
}
  }
}