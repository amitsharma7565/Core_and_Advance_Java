// to print 1 to n prime number
import java.util.*;
class PrimeNumberPrint{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number");
    int num= sc.nextInt();
   
    int i;
    int j;
    for(i=2;i<=num;i++){ //2<=10
       int count=0;
      for(j=1;j<=num;j++){ //1<=10
        if(i%j==0){//2%==0
          count++; //count 2
        } 
      }
     if(count==2){
       System.out.println(i);
     }
    }
  }
}