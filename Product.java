// prodct of digit
//   user enter 7894=7*8*9*4=product
import java.util.*;
class Product{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=s.nextInt();//5
    int rem,pro=1;
    for(int i=1;i<=num;i++){
      rem=num%10;
      pro=pro*rem;
      num=num/10; 
      }
      System.out.println(pro);
  }
}