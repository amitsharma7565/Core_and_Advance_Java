class ExceptionHandlingFinallyKey{
  public static void main(String args[]){
    int a=10;
    int b=0;
    try{
      System.out.println(a/b);
    }
    catch(Exception e){
      System.out.println(e);
    }
    finally{
      System.out.println("Important code here in final block");
    }
    System.out.println("rest of code here");
  }
}