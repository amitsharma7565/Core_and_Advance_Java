import java.util.Scanner;
class FantasyKingdom1 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter age");
    int age=sc.nextInt();
    if(age>15){
      System.out.println("Allowed");
    }
    else {
      System.out.println("Not Allowed");
      }
  }
}