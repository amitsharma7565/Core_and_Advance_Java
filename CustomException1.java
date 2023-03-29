class MyException extends Exception{
 public MyException(String str){
    super(str);
  }
}

class CustomException1{
  public static void age(int age) throws MyException{
  
    if(age<18){
      throw new MyException ("age is invalid");
    }
    else{
      System.out.println("Age is valid");
    }
  }
  public static void main(String args[]){
    try{
      age(17);
    }
    catch (Exception e){
      System.out.println(e);
    }
    System.out.println("Exception handle");
  }
}