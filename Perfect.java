
import java.util.*;
class Perfect{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    System.out.println("Enter the nummber");
    int num=sc.nextInt();
    for(int i=1;i<num;i++){
      if(num%i==0){
        sum=sum+i;
      }
    }
    if(sum==num){
      System.out.println("perfect number");
    }
    else{
      System.out.println("not perfect number");
    }
  }
}