class MultipleCatchExceptionHandling{
  public static void main(String args[]){
    int i,j,k;
    i=10;
    j=5;
    int a[]={1,2,3,4,5};
    try{
      k=i/j;
      for(int c=0;c<=a.length;c++){
        System.out.println(a[c]);
      }
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
    catch(Exception e1){
      System.out.println(e1);
    }
  }
}