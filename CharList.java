import java.util.*;
class CharList{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int size=sc.nextInt();
   String a[]=new String[size];
    System.out.println("enter array values");
    for(int i=0;i<a.length;i++){//i=2
      a[i]=sc.next();
    }
System.out.println("Array elements");
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    }
  }