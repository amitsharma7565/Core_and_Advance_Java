import java.io.*;
class ListOFFile{
  public static void main(String args[]) throws Exception{
    int count=0;
    File f= new File("Pallu");
    String s[]=f.list();
    for(String si:s){
      count++;
      System.out.println(si);
    }
    System.out.println("Total number of files is "+count);
  }
}





i