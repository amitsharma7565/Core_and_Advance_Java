import java.util.*;
class OddArray{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size");
    int size = s.nextInt();
    int a[]=new int[size];
    System.out.println("Enter the array value");
    for(int i=0;i<size;i++){
      a[i]=s.nextInt();
    }
    for(int i=0;i<size;i++){
      if(a[i]%2!=0){
        System.out.println("The odd number in array is "+a[i]);
      }
    }
  }
}