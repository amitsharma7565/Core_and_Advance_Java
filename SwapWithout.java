import java.util.*;
class SwapWithout{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("a is "+a+" and b is "+b);
    a=a+b;//30;
    b=a-b;//10;
    a=a-b;//20;
    System.out.println("After swapping a is "+a+ ", and b is "+b);
  }
}