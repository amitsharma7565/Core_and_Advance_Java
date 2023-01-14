import java.util.regex.*;
class Regex1{
  public static void main(String args[]){
    Pattern p = Pattern.compile("..c");
    Matcher m= p.matcher("abc");
    boolean b= m.matches();
    System.out.println(b);
  }
}