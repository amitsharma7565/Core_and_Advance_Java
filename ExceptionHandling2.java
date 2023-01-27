// Write a Java program that uses try-catch blocks to handle a potential null pointer exception when trying to access an element in an array.



public class ExceptionHandling2 {
    public static void main(String[] args) {
      String a[]={"amit","Sharma","Himachal",null};
      String len=a[3];
      try{
        System.out.println(a[3].length());
      }
      catch(Exception e){
        System.out.println(e);
      }

    }
}