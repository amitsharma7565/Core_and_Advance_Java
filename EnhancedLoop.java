class EnhancedLoop{
  public static void main(String args[]){
  int a []=new int[5];
    for(int i=0;i<5;i++){
      a[i]=i+1;
    }
    // for(int i=0;i<5;i++){
    //   System.out.println(a[i]);
    // }
    // Enhanced loop
    for(int i:a){
      System.out.println(i);
    }
  }
}