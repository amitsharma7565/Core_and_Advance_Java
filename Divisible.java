import java.util.Scanner;
class Divisible{
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int num=sc.nextInt();
    if( num%5==0 && num%3==0)
      System.out.println("number is divisible by 5 and 3");
    else
      System.out.println("number is not divisible by 5 and 3");
  }
}