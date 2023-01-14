import java.io.*;
class ConstructorFileIO{
  public static void main(String args[]) throws Exception{
    // three constructor are use 
    File f= new File("Pallu");
    File f2= new File("Pallu","abc.txt");
    File f3= new File(f,"abc.txt");
    f3.createNewFile();
    System.out.println(f.isFile("abc.txt"));
  }
}