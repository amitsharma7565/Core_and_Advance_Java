class ExceptionHandlingSample3{
  public static void main(String args[]){
    String a=null;
    try{
      System.out.println(a.length());
    }
    catch(Exception s){
      System.out.println(s);
    }
    
  }
}