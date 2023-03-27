class SumOfPrime{
  public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
  int sumOfPrime=0;
    for(int i=0;i<arr.length;i++){
      int count=0;
      for(int j=1;j<=arr[i];j++){
        if(arr[i]%j==0){
          count++;
        }
        // System.out.println(count);
      }
      if(count==2){
        sumOfPrime=sumOfPrime+arr[i];
      }
    }
    System.out.println(sumOfPrime);
      
  }
}