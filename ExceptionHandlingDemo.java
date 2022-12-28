// Check the mobile nunber is valid or not?? 
class ExceptionHandlingDemo{
  public static void mobileNumber(String str){
    if(str.length()==10){
      System.out.println("Valid mobile number");
    }
    else{
      throw new NumberFormatException("Invalid phone number");
    }
  }
  public static void main(String args[]){
    try{
      mobileNumber("88941812612");
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}