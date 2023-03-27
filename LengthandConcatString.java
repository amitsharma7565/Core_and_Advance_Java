class LengthandConcatString{
  public static void lengthOfString(String str){
    String str2[]= str.split(" ");
    System.out.println(str2.length);
  }
  public static void concatOfString(String str1, String str2){
    String str3=str1.concat(str2);
    System.out.println(str3);
    // concat by +sign 
    System.out.println(str1+" "+str2);
  }
  
  public static void main(String args[]){
    lengthOfString("hi Amit");
    concatOfString("hi","Amit");
  }
}