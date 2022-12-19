import java.util.*;
class PrimeNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int count=0;
    for(int i=1;i<=100;i++){
        for(int j=1;j<=num;j++){
    if(num%j==0){
      count++;
    }
  }
    if(count==0){
      System.out.println(i);
    }
  }
    }

  
}