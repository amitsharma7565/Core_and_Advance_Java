import java.util.*;
class ReverseString{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int length=s.length();
    String rev="";
    // System.out.println(length);
    for(int i=length-1;i>=0;i--){
      rev=rev+s.charAt(i);
    }
    System.out.println(rev);
  }
}
// class ReverseString{
//   public static 
// }