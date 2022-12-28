class ExceptionHandlingFinally{
  public static void main(String args[]){
    int i=10;
    int j=2;
    try{
      int k=i/j;
      System.out.println(k);
    }
    catch(Exception e){
      System.out.println(e);
    }
    finally{
      System.out.println("bye");
    }
    
  }
}