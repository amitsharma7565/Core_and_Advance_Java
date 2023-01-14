import java.io.*;
class PrintWriteSmaple {
  public static void main(String args[])throws Exception {
    FileWriter fw = new FileWriter("abc.txt");
    PrintWriter pw=new PrintWriter(fw);
    pw.write(100);
    pw.println(100);
    pw.print("Amit");
    pw.println("DurgaSoft");
    pw.println(true);
    pw.flush();
    pw.close();
  }
}