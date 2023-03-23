class SecondLargestNuber{
  public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,8,2,19,18,1};
    // int max=arr[0];
    //   for(int i=0;i<arr.length;i++){
    // if(arr[i]>max){
    //   max=arr[i];
    // }
    //   }
    // System.out.println(max);
int temp;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
System.out.println(arr[1]);
    
  }
}