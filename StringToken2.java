import java.util.*;
class StringToken2{
  public static void main(String args[]){
    String num="123";
    StringTokenizer st=new StringTokenizer("lalitha 123 14.35");
      while(st.hasMoreTokens()){
        // System.out.println(st.nextElement());
        if(num.equals(t.nextElement())){
          System.out.println(num);
        }
      }
    
    // System.out.println(st.nextToken(" "));
  }
}