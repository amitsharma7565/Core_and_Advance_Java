class CountEvenOddNeg{
  int arr[]={1,2,3,4,5,7,8,9,6};
  public void countEven(){
    int counte=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        counte++;
      }
    }
    System.out.println(counte);
  }
  public void countOdd(){
    int counto=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
        counto++;
      }
    }
    System.out.println(counto);
  }
   public void countNeg(){
    int countneg=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<0){
        countneg++;
      }
    }
    System.out.println(countneg);
  }
  public static void main(String args[]){
    CountEvenOddNeg c=new CountEvenOddNeg();
    c.countEven();
    c.countOdd();
    c.countNeg();
  }
}