import java.util.*;
class Sort{
  public static void main(String args[]){
    // Create a array
    int a[]={1,9,3,12,7,4};
    // Arrays.sort(a);
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
          int temp =a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
  }
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
}
}