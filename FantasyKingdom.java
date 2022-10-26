
import java.util.Scanner;
class FantasyKingdom {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter age");
    int age=s.nextInt();
    if(age>15){
      System.out.println("Adult Ticket");
    }
    else {
      System.out.println("Child Ticket");
      }
  }
}