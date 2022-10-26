import java.util.Scanner;
class cermony {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter ticket number");
    int lastdigit=sc.nextInt();
    if(lastdigit%10==3 || lastdigit%10==8){
      System.out.println("Lucky Winner");
    }
    else {
      System.out.println("Not a lucky winner");
      }
  }
}