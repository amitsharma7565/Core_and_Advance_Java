import java.io.*;
import java.util.*;
class Match{
  public static void main(String args[]) throws IOException{
    FileReader fr=new FileReader("Match.csv");
    BufferedReader br=new BufferedReader(fr);
    // String str2=null;
    int mcount=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the city");
    String city_name=sc.next();
    
    String str2=null;
    while((str2=br.readLine())!=null){
      String city[]=str2.split(",");
      for(int i=0;i<city.length;i++){
         if(city[i].equals(city_name)){
           mcount++;
        }
      }
    }
    System.out.println("The number of matches in"+" "+city_name+" "+mcount);
  }
}