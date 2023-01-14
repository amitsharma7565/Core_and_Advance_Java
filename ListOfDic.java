import java.io.*;
class ListOfDic{
  public static void main(String args[]) throws Exception{
    File f=new File("Pallu");
    String str[]=f.list();
    for(String s:str){
      File f2=new File(f,s);
      if(f2.isDirectory()){
        System.out.println(s);
      }
      
    }
  }
}
