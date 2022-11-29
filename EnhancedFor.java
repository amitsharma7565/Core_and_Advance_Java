import java.util.*;
class EnhancedFor{
  public static void main(String args[]){
    int a[]=new int[5];
    Random r= new Random();
    for(int i=0;i<4;i++){
      a[i]=r.nextInt(10);
    }
    for(int n:a){
      System.out.println(n);
    }
  }
}