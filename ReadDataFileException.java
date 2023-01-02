//custom exception for name should be greaterthn 5 char invalid exception.
//custom exception marks should be lessthan 200 invalid marks
//read data from file we need to read sname and marks check two exceptions then we can print data.
//-----------------------------------------------------------------------
// custom Excepion
import java.io.*;
import java.util.*;
class NameException extends Exception{
  public NameException(String str){
    super(str);
  }
}
class MarksException extends Exception{
  public MarksException(String str){
    super(str);
  }
}

class ReadDataFileException{
  public static void main(String args[]) throws NameException,MarksException,IOException{
BufferedReader rd=new BufferedReader(new FileReader("Student.txt"));
    String str;
    try{
       while((str=rd.readLine())!=null){
         String arr[]=str.split(",");
         if(arr[1].length()<5){
           throw new NameException("grater than 5 charcter");
         }
         
          if(Integer.parseInt(arr[2])<200){
           throw new MarksException("less than 200");
         }
         
    }
      
    }
    catch(Exception e){
      System.out.println(e);
    }
   
  }
}