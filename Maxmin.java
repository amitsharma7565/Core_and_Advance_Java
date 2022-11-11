// Write a java program to find the differnce between maximum and minimum element in the array??
import java.util.*;
class Maxmin{
  public static void main(String args[]){
    int max=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size =s.nextInt();
    int a[]=new int[size];
    System.out.println("Enter the array values");
    // for entering the value
    for(int i=0;i<size;i++){
      a[i]=s.nextInt();
    }
    int min=a[0]; 
    max=a[0];
    for(int i=0;i<size;i++){
      if(a[i]>max){
        max=a[i];
      }
      if(a[i]<min){
        min=a[i];
      }
    }
    System.out.println("The difference is :"+(max-min));
  }
}