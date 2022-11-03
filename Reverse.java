// reverse of given number
//   last digit=number%10
//   remove digit=number/10
//   0*10+last digit;
// last digit*10+last digit

 
import java.util.*;
class Reverse{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int rem,rev=0;
    for(int i=0;i<=num;i++){
      rem=num%10;//last digit
      rev=rev*10+rem;
      num=num/10;//remove the last digit
    }
   System.out.println(rev);
  }
}