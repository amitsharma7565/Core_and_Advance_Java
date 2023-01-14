// Kevin McCarthy elected U.S. House Speaker in vote 15 after chaotic week
// nivek Mc

// import package
import java.util.*;
class ReverseTheString{
  public static void main(String args[]){
 
    String str= " Kevin McCarthy elected U.S. House Speaker in vote 15 after chaotic week";
    StringTokenizer st = new StringTokenizer(str);
  
    while(st.hasMoreTokens()){
    StringBuilder sb=new StringBuilder(st.nextToken());
      sb.reverse();
      System.out.print(sb+" ");
    }
    
  }
}