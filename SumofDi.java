import java.util.*;
class SumofDi{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int rem,prod=1;
    int last_digit=n%10;
    while(n>=9)
      {
        n=n/10;
      }
    int first_number=n;
    int sum=first_number+last_digit;
    System.out.println(sum);
    }
  }