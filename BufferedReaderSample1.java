import java.io.*;
class BufferedReaderSample1{
  public static void main(String args[]) throws Exception{
    FileReader fr = new FileReader("amit.txt");
    BufferedReader br = new BufferedReader(fr);
    String str;
    while((str=br.readLine())!=null){
      System.out.println(str);
    }
    br.close();
  }
}