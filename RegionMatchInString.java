//Write a Java program to find out whether a region in the current string matches a region in another string.


class RegionMatchInString{
  public static void main(String args[]){
    String str1="Shanghai Houston Colorado Alexandria";
    String str2="Alexandria Colorado Houston Shanghai";

    // boolean check= str1.regionMatches(0,str2,28,8);
    boolean check2= str2.regionMatches(11,str1,17,8);
    System.out.println(check2);
  }
}