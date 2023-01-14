import java.io.*;
class MergeLineByLine{
  public static void main(String args[]) throws Exception{
    PrintWriter pw = new PrintWriter("Final.txt");
    BufferedReader br1 = new BufferedReader(new FileReader("Abc1.txt"));
    BufferedReader br2 = new BufferedReader(new FileReader("Abc2.txt"));
    String line1;
    String line2;
    while(((line1=br2.readLine())!=null)||((line2=br2.readLine())!=null)){
      pw.println(line1);
      pw.println(line2);
    }
    pw.flush();
    pw.close();
  }
}