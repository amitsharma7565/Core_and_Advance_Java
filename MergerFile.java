import java.io.*;
class MergerFile{
  public static void main(String args[]) throws Exception{
    PrintWriter pw = new PrintWriter("File.txt");
    BufferedReader br = new BufferedReader(new FileReader("Abc1.txt"));
    String str;
    while((str=br.readLine())!=null){
      pw.println(str);
    }
    br=new BufferedReader(new FileReader("Abc2.txt"));
    while(((str=br.readLine())!=null)){
      pw.println(str);
    }
    pw.flush();
    pw.close();
  }
}