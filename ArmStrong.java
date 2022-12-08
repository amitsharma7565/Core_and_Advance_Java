import java.util.*;
class ArmStrong{
  public static void main(String args[]){
    int num=1634;
    int rem,sum=0;
    int temp=num;
    while(num>0){
      rem=num%10;
      num=num/10;
      sum=sum+rem*rem*rem*rem;
    }
    if(sum==temp){
      System.out.println("ArmStrong number");
    }
    else{
      System.out.println("Nit a armstrong Number");
    }
  }
}
