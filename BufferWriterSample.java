import java.io.*;
class BufferWriterSample{
  public static void main(String args[]) throws Exception{
    FileWriter fw= new FileWriter("amit.txt"); 
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(100);
    bw.newLine();
    char ch[]={'a','b','c','d'};
    bw.write(ch);
    bw.newLine();
    bw.write("Amit is good boy");
    bw.flush();
    bw.close();
  }
}