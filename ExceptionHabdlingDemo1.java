class ExceptionHabdlingDemo1{
  
   public static void checkd()  throws Exception {
        int num=10;
    int num2=0;
     try{
        int div=num/num2;
     }
     catch(Exception e){
       System.out.println(e);
     }    
   }
  
  public static void main(String args[]) {
    try{
       checkd();
    }
    catch(Exception e){
      System.out.println(e);
    }
     
    System.out.println("Exception Handle");
  }
}