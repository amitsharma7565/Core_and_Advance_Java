class FirstLargest{
  public void large(){
    int arr[]={1,2,3,7,2,3};
    int temp=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]>temp){
        temp=arr[i];
      }
    }
    System.out.println("Largest is "+temp);
  }
  public static void main(String args[]){
    FirstLargest f=new FirstLargest();
    f.large();
  }
}