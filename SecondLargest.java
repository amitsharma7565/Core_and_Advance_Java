// find the largest element and delete it and display the second largest  number.
import java.util.*;
class SecondLargest{
  public static void main(String args[]){

    int a[]={1,6,4,5,13,8,10};


    
  int large=a[0];
  int index=0;
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
      if(large<a[i]){
        large=a[i];
        index=i;
       
      }
    }
     System.out.println("Largest element is"+" "+large+" and the index is "+index);

    int newa[]=new int[a.length-1];
int large2=newa[0];
    int j=0;
    for(int i=0;i<a.length;i++){
      if(i!=index){
        newa[j++]=a[i];
      }
    }

    for(int i=0;i<newa.length;i++){
      if(large2<newa[i]){
        large2=newa[i];
      }
   
    }
         System.out.println("Largest element is"+" "+large2);

  }
}