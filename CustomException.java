// create the custom Exception 
// step 1:- Class with name own ExceptionName extends from Exception class
class AmitException extends Exception{
  // step 2 create the constructor 
  public AmitException(String str){
    super(str);
  }
}

class CustomException{
  // create a method 
  public static void checkMobileNumber(String str) throws AmitException{
    if(str.length()==10){
      System.out.println("valid number");
    }
    else {
      throw new AmitException("invalid mobile number");
    }
  }
  
  public static void main(String args[]){
    try{
      checkMobileNumber("88941812612");
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}