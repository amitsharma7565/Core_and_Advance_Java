import java.util.*;
class Sumofd{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int rem,sum=0;
    while(n>0)
      {
       rem=n%10;
        sum=sum+rem;
        n=n/10;
      }
    System.out.println(sum);
    }
  }