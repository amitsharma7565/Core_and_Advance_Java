// Write a Java program to create a distinct identifier for a given string.

class PrintTheHashCode{
  public static void main(String args[]){
    String str=new String("hi my");
    int code= str.hashCode();
    System.out.println(code);
  }
}