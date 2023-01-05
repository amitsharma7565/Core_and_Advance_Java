/* 2. Write a program to read data from a file and find the frequency of each word in a file. 
      And print each word along with frequency in sorted order.

   Sample Input: Create text file and write some data to the file.
   Expected Output:

      word 1: top frequency
            :
            :
            :
      Word n:  least frequency
*/
import java.util.*;
import java.io.*;
public class FindingFrequency {

    public static void main(String args[]) throws IOException {
      FileReader fist = new FileReader("data.txt"); // Charcter stream
    BufferedReader br = new BufferedReader(fist);
    String str;
    String[] arr = new String[80];
    ArrayList<String> al = new ArrayList<String>();
    while ((str = br.readLine()) != null) {
      System.out.println(str);
      arr = str.split(" ");
      Collections.addAll(al, arr);
    }
  int count=0;
    int [] fre=new int[al.size()];
    
    for (int i = 0; i < al.size(); i++) {
      count=1;
      for(int j=i+1;j<al.size();j++){
        if(al.get(i).equals(al.get(j))){
          count++;
            fre[j]=-1;
        }
      }
      if(fre[i]!=-1){
        fre[i]=count;
      }
    }
    for(int i=0;i<al.size();i++){
      if(fre[i]!=-1){
      System.out.println(al.get(i)+"          "+fre[i]);
      }
    }
  }
}