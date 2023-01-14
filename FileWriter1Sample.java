import java.io.*;
class FileWriter1Sample{
  public static void main(String args[]) throws IOException{
    // override
    // FileWriter f = new FileWriter("abc.txt");
    // append
    FileWriter f = new FileWriter("abc.txt",true);
    f.write(100);
    f.write("urga\n software soln");
    char arr[]= {'a','b','c','d'};
    f.write(arr);
    f.flush();
    f.close();
  }
}

