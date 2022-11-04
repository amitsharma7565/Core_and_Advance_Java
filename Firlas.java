// Sum of first and last digit of given number;
import java.util.*;
class Firlas{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int last_digit=num%10;
    while(num>9){
      num=num/10;
    }
    int firts_digit=num;
    System.out.println(last_digit+firts_digit);
  }
}