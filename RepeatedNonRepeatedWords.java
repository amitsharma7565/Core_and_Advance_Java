/* 1. Write a Java program to print list of repeated words and list of non-repeated words in a given file and 
      print number of repeated words and number of non-repeated words.

     Sample Input: Create text file and write some data to the file.

     Expected Output:
     Repeated words: 
     // Display all words which are repeating
     Number of repeated words: 33
     Non-Repeated Words: 
     // Display all words which are not repeating
     Number of repeated words: 12
*/
import java.io.*;
import java.util.*;
public class RepeatedNonRepeatedWords{

  public static void main(String args[]) throws Exception {
    System.out.println("Create text file");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count=0;
        int ncount=0;
        String[] words = input.split(" ");
        Map<String,String> map = new HashMap<String,String>();                
        Map<String,String> map1 = new HashMap<String,String>();
        for(int i=0;i<words.length;i++) {
            String word = words[i].toUpperCase(); 
            if(map.get(word)!=null) 
            {
                if(map1.get(word)==null)
                { 
                    count++;
                    map1.put(word, word); 
                }
            }
            else 
            {
                ncount++;
                map.put(word, word);
                
            }
        }
        System.out.println("Number of repeated words: "+count);
        System.out.println("Number of non-repeated words:"+ncount);
}
}