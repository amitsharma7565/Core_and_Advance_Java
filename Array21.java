import java.util.*;
class Array21{

  
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size= sc.nextInt();
    int arr[]=new int[size];
    int max=0;
    int total=0;
    System.out.println("Enter the values");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int min=arr[0];
    for(int j=0;j<arr.length;j++){
      if(max<arr[j]){
        max=arr[j];
      }
    }
     for(int k=0;k<arr.length;k++){
      total=total+arr[k];
    }
    double avg=total/arr.length;

    for(int l=0;l<arr.length;l++){
      if(arr[l]<min){
        min=arr[l];
      }
    
    }    System.out.println("max value in the array is "+max);
    System.out.println("Average is "+avg);
        System.out.println("min elemtent is "+min);
  }
}