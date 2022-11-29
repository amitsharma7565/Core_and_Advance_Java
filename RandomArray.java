import java.util.*;
class RandomArray{
  public static void main(String args[]){
    Random r=new Random();
    int a[]=new int[20];
    for(int i=0;i<a.length;i++){
      a[i]=r.nextInt(10);
    }
    for(int i =0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}