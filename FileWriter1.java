import java.io.*;
class FileWriter1{
  public static void main(String args[]){
    try{
      FileWriter f = new FileWriter("Amit.txt");
      f.write("hi my name is Amit Sharma");
      f.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
    
  }
}