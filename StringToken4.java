import java.util.*;

// class Reverse{

// }
class StringToken4{
    public void Rev(){
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  StringTokenizer st=new StringTokenizer(str);
    while(st.hasMoreTokens()){
     StringBuffer sb=new StringBuffer(st.nextToken());
    sb.reverse();
    System.out.println(sb);
  }
  } 
  public static void main(String args[]){
    Reverse r=new Reverse();
    r.Rev();
  }
}
