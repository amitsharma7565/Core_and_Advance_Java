class Max{
  public static void main(String args[]){
    int a[]={12,56,34,88,99,1,1234};
    int max=a[0];
    for(int i=0;i<a.length;i++){
      if(a[i]>max){//56>12
        max=a[i]; //56
      }
    }
    System.out.println(max);
  }
}