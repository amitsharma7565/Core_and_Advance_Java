// We had validated email address of users but we failed to validate domain names of the email address. The issue thankfully came up during our testing. Let's patch that issue in the application now. The fair organizers have listed the accepted domains as "com", "in", "net", and "org". Write a program to validate email addresses that have the above listed domain names.
// Create a driver class called Main. In the Main method, obtain the inputs from the console and validate the email address.


class Email{ 
  public static void main(String args[]){
     String email="amitsha.com";
      int i=email.indexOf(".");
    int l=email.length();
    System.out.println(l);
    System.out.println(i);
    String str=email.substring(i+1,email.length());
    System.out.println(str);
    if(str.equals("in")||str.equals("org")||str.equals("com")||str.equals("net")){
      System.out.println("valid");
    }
    else{
      System.out.println("not valid");
    }
  }
 
}