class MaxinArray{
  public static void main(String args[]){
    int max=0;
    int a[]={12,643,463,6,3,67,3,6,62,2};
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
      }
    }
    System.out.println(max);
  }
}