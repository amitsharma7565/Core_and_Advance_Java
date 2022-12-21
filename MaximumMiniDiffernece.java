class MaximumMiniDiffernece{
  public void Diff(int a[]){
    int temp=a[0];
    for(int i=0;i<a.length;i++){
      if(a[i]>temp){//5>10
        temp=a[i];//temp=10
      }
    }
    int temp2=a[2];
    for(int j=0;j<a.length;j++){
      if(temp2>a[j]){//1>1
        temp2=a[j];// temp2=1
      }
    }
    System.out.println("minimum is "+temp2);
    System.out.println("Maiximum is "+temp);
    System.out.println("Differnce is "+(temp-temp2));
  }
  
  public static void main(String args[]){
    int arr[]={1,2,3,10,5};
    MaximumMiniDiffernece m= new MaximumMiniDiffernece();
    m.Diff(arr);
  }
}