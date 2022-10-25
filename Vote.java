import java.util.Scanner;
class Vote{
  public static void main(String args[])
  {
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a age");
     age=sc.nextInt();
    System.out.println("enter Weight");
    int weight=sc.nextInt();
    if(age>18 && weight>50)
      System.out.println("Eligible for blood donation");
    else
      System.out.println("Not eleigible for blood donation");
  }
}