import java.util.*;
class NumberType
  {
    public static int findType(int n){
      int sum=0;
      for(int i=1;i<=n/2;i++){
        if(n%i==0){
          sum=sum+i;
        }
        
      }
      System.out.println(sum);
      if (sum==n){
        return 1;
      }
      else if(sum>n){
        return 0;
      }
      else{
        return -1;
      }
    }
  }
public class Sample {
   public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
    int result= NumberType.findType(num);
     if(result==1){
       System.out.println("perfect number");
     }
     else if(result==0){
         System.out.println("defecient number");
     }
     else{
         System.out.println("abundent number");
     }
     
   }
}