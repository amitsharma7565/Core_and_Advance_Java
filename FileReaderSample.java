// import java.io.*;
// class FileReaderSample{
//   public static void main(String args[]) throws IOException{
//     FileReader fr = new FileReader("abc.txt");
//     int i=fr.read();
//     while(i != -1){
//       System.out.print((char)i);
//       i=fr.read();
//     }
//   }
// }

import java.io.*;
class FileReaderSample{
  public static void main(String args[]) throws IOException{
    File f=new File("abc.txt");
    FileReader fr = new FileReader(f);
    char ch[]=new char[(int)f.length()];
    fr.read(ch);
   for(char ch1:ch ){
     System.out.print(ch1);
   }
  }
}
