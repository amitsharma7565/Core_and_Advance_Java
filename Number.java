import java.util.*;
class Number{
  public static void main(String arrgs[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    if(num%5==0){
      System.out.println("Divisible by 5");
    }
    else
      System.out.println("Not Divisible by 5");
  }
}