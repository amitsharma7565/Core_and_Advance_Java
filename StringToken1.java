import java.util.*;
class StringToken1{
  public static void main(String args[]){
    String str="my name is Amit Sharma";
    StringTokenizer st=new StringTokenizer(str);
    while(st.hasMoreTokens()){
      System.out.println(st.nextToken());
    }
    
  }
}