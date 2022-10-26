import java.util.Scanner;
class Ticket {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the Age");
    int age=s.nextInt();
    if(age>15){
      System.out.println("Welcome to the show");
    }
    else {
      System.out.println("Welcome to the show");
      System.out.println("Please note that you should be accompanied by an adult");
      
    }
  }
}