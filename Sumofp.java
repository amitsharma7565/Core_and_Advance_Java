import java.util.*;
class Sumofp{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the range");
    int num=s.nextInt();
    int pro=1,rem;
    while(num>0){
      rem=num%10;
      pro=pro*rem;
      num=num/10;
      }
    System.out.println(pro);
    }
  }
