import java.util.*;
class String2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=s.nextLine();
    if(str.contains("bitlabs".trim())){
    System.out.println("String is found in the document");
}
  else{
  System.out.println("String is not found in the document");
  }
  }
}


// public class String2 {
//   public static void main(String[] args) {
//     String myStr = "       Hello World!        ";
//     System.out.println(myStr);
//     System.out.println(myStr.trim());
//   }
// }