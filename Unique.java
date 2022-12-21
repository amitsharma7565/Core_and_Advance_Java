class Unique{
  public void uni(int arr[]){
    for(int i=0;i<arr.length;i++){
      int count=0;
      for(int j=0;j<arr.length;j++){
        if(arr[i]==arr[j]){
          count++;
        }
      }
      if(count==2){
        System.out.println(arr[i]);
      }
  }
  }
  public static void main(String args[]){
    int array[]={1,2,3,3,4,5,1,2};
    Unique u=new Unique();
    u.uni(array);
  }
}
