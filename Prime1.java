// prime number=number divide by 1 and itself
// 3,5,7,13,17;
// prime number between 1 to n
import java.util.*;
class Prime1{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number to check its prime number or not ");
    int num=s.nextInt();
    int i=1,count=0;
    while(num>=i){
      if(num%i==0){
        count++;
      }
      i++;
    }
    if(count==2){
      System.out.println(num+" Prime number");
    }
    else{
      System.out.println(num+" Not Prime number");
    }
    }
  }
