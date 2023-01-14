 //how many time got toss as feild and bating particular team
import java.util.*;
import java.io.*;
class FindBatandFieldInCSV{
  public static void main(String args[]) throws IOException{
Scanner sc= new Scanner(System.in);
 FileReader fr=new FileReader("Match.csv");
    BufferedReader br=new BufferedReader(fr);
   
     // Find index 
    String index=null;
      index=br.readLine();
      String ind[]=index.split(",");
      for(int i=0;i<ind.length;i++){
        if(ind[i].equals("Toss_Name")){
          System.out.println(i);
        }
      }
     System.out.println("Enter the team name");
    String team_name= sc.nextLine();
    
    String str=null;
    int fcount=0;
    int bcount=0;
    while((str=br.readLine())!=null){
      String sarr[]=str.split(",");
      for(int i=0;i<sarr.length;i++){
         if(sarr[i].equals(team_name)){
           if(sarr[11].equals("field")){
             fcount++;
           }
           if(sarr[11].equals("bat")){
             bcount++;
           }
      }
      }
     
    }
    System.out.println("field is "+fcount);
    System.out.println("Bat is "+bcount);
  }
}