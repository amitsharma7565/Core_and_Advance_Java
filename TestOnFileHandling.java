// Imagine you are building a program that processes and stores data from a 
// large number of text files. You want to ensure that the program is able to handle 
// files of any size, but you also want to be notified if a file is unusually large. 
// You could create a custom exception called LargeFileException that is thrown when 
// the size of a file exceeds a certain threshold. 

// import java.io.*;
// // custom Exceptio
// class LargeFileException extends Exception{
//   public LargeFileException(String str){
//     super(str);
//   }
// }


// class TestOnFileHandling{
//   public static void main(String args[]) throws LargeFileException {
    
//     try{
//       File fs=new File("test.txt");
//        fs.createNewFile();
//       long size=fs.length();
//     System.out.println("Size is "+ size +"bytes");
//       // if the size of the file is larger then 100bytes then throw Exception 
//       if(size>100){
//         throw new LargeFileException("size is large");
//       }
//     }
//     catch(Exception e){
//       System.out.println(e);
//     }
   
//   }
// }




/*Imagine you are building a program that processes and stores data from a large number of text files. You want to ensure that the program is able to handle files of any size, but you also want to be notified if a file is unusually large. You could create a custom exception called LargeFileException that is thrown when the size of a file exceeds a certain threshold.*/
import java.io.*;
//custom Exception
 class LargeFileException extends Exception {
    public LargeFileException(String work) {
        super(work);
    }
}
//main class
class Large{
  //final length of textfile
     long filesize=1000l;
//method for large
    public void process(String filepath) throws LargeFileException,IOException{
        File file = new File(filepath);
        long size= file.length();
        if (size>filesize) {
            throw new LargeFileException("File size exceeded threshold: " + filesize+ " bytes");
        }
      else{
        FileReader fr=new FileReader(filepath);
        int i;
        while((i=fr.read())!=-1){
           System.out.print((char)i);
        }
         
      
      }
       
    }
//main method
public static void main(String[] args) throws IOException{
    //try and catch block for custom exception
    try {
      Large la=new Large();
      la.process("studentdata.txt");
    } catch (LargeFileException e) {
      System.out.println( e.getMessage());
    } catch(IOException o){
      System.out.println(o.getMessage());
    }
 
  }
}
 