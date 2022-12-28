class ExceptionHandlingThrow{
  public static void vote(int age){
    if(age>18){
      System.out.println("eliglible");
    }
    else{
      throw new ArithmeticException("under age");
    }
  }
  public static void main(String args[]){
    try{
      vote(12);
  }
    catch(Exception e){
      System.out.println(e);
    }
}
}