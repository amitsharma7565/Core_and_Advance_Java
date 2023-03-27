//  Write a JAVA program to find reverse of a string.
class ReverseOfString{
  public static void main(String args[]){
    String str ="hi i am Amit";  

    for(int i=str.length()-1;i>=0;i--){
      System.out.print(str.charAt(i));
    }
  }
}