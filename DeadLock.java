/* 4. Write a program to create two Threads by extending from Thread class. And create two file like abc.txt file and xyz.txt file.
    • Thread1 should read data from abc.txt then it should read data from xyz.txt file and display on console.  
    • Thread2 should read data from xyz.txt then it should read data from abc.txt file and display on console.
    Create two synchronized blocks to achieve dead lock.  
*/
import java.io.*;
class ThreadEx1 extends Thread{
  File file1;
  File file2;
  ThreadEx1(File file1,File file2){
    this.file1=file1;
    this.file2=file2;
  }
  public void run(){
    synchronized(file1){
      try{
        BufferedReader br=new BufferedReader(new FileReader(file1));
        String str;
        while((str=br.readLine())!=null){
          System.out.println(str);
        }
         System.out.println("abc.txt is blocked by "+Thread.currentThread().getName());
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
      synchronized(file2){
        try{
           BufferedReader br=new BufferedReader(new FileReader(file2));
        String str;
        while((str=br.readLine())!=null){
          System.out.println(str);
        }
           System.out.println("xyz.txt is blocked by "+Thread.currentThread().getName());
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
          
        }
      }
    }
  }
class ThreadEx2 extends Thread{
  File file1;
  File file2;
  ThreadEx2(File file1,File file2){
    this.file1=file1;
    this.file2=file2;
  }
  public void run(){
    synchronized(file2){
      try{
        BufferedReader br=new BufferedReader(new FileReader(file2));
        String str;
        while((str=br.readLine())!=null){
          System.out.println(str);
        }
         System.out.println("xyz.txt is blocked by "+Thread.currentThread().getName());
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
      synchronized(file1){
        try{
           BufferedReader br=new BufferedReader(new FileReader(file1));
        String str;
        while((str=br.readLine())!=null){
          System.out.println(str);
        }
          System.out.println("abc.txt is blocked by "+Thread.currentThread().getName());
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
          
        }
      }
    }
  }

public class DeadLock  {

	public static void main(String args[]) throws IOException{
    File file1=new File("abc.txt");
    File file2=new File("xyz.txt");
	 ThreadEx1 t1=new ThreadEx1(file1,file2);
   ThreadEx2 t2=new ThreadEx2(file1,file2); 
    t1.start();
    t2.start();
	}
}