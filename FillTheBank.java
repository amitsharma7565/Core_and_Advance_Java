import java.util.*;
class FillTheBank{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the noun");
    String noun= sc.next();
    System.out.println("Enter the adjective");
    String adjective=sc.next();
    System.out.println("Enter the activity");
    String activity=sc.next();

    String story= noun+ " was really " + adjective+" today. We learned how to write "+ activity+ " today. i can not wait for tomorrow!";
    System.out.println(story);
  }
}
