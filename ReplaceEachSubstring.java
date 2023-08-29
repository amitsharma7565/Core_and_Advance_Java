// Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
class ReplaceEachSubstring{
  public static void main(String args[]){
    String str1="Hi My name is amit Sharma";
    String final_str=str1.replaceAll("amit","Mohan");
    System.out.println(final_str);
  }
}