import java.util.*;
class SecondLargestArrya{
  public void large(){
    int arr[]={1,2,3,7,2,3};
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String args[]){
    SecondLargestArrya f=new SecondLargestArrya();
    f.large();
  }
}