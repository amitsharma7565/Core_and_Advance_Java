class ArrayPrintNegtive{
  public void arrayNeg(){
    int arr[]={1,2,3,4,5,6,-1,-2,-5,-7,5};
    for(int i=0;i<arr.length;i++){
      if(arr[i]<0){
        System.out.println(arr[i]);
      }
    }
  }
  public static void main(String args[]){
    ArrayPrintNegtive ap=new ArrayPrintNegtive();
    ap.arrayNeg();
  }
}