import java.util.*;
class StringAddArray{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String");
    String str =sc.nextLine();
    System.out.println("Enter the array size");
    int num=sc.nextInt();
    String str1[]= new String[num];

    for(int i=0;i<str1.length;i++){
      str1[i]=str;
    }
    for(int j=0;j<str1.length;j++){
      System.out.println(str1[j]);
    }
  }
}