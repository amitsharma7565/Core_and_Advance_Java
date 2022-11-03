// // factors of given number
// 8-1,2,4;
// 20-1,2,4,5,10;
// 35-1,5,7,35;
// 36-1,2,4,6,9,12,18;
import java.util.*;
class Perfect1{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=s.nextInt();
    for(int i=1;i<=num;i++){
      if(num%i==0){
        System.out.println(i);
      }
    }
  }
}