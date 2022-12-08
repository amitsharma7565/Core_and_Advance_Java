import java.util.*;

class String3 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the String1");
    String s1 = s.nextLine();
    System.out.println("Enter the String2");
    String s2 = s.nextLine();
    if (s1.equals(s2)) {
      System.out.println("Red");
    }
    else if(s1.replace(" ", "").equals(s2.replace(" ", ""))){
      System.out.println("yellow");
    }
    else if(s1.equalsIgnoreCase(s2)){
      System.out.println("Blue");
    }
    else if (s1.equals(s2)!=true){
      System.out.println("Green");
    }
  }
}