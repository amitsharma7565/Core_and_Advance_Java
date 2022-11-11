import java.util.*;
class Addarray{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the row size");
    int row=s.nextInt();
    System.out.println("Enter the colmn size");
    int colm=s.nextInt();
    int a[][]=new int[row][colm];
    int b[][]=new int[row][colm];
    int c[][]=new int[row][colm];
    System.out.println("Enter the array values");
    for(int i=0;i<row;i++){
      for(int j=0;j<colm;j++){
         a[i][j]=s.nextInt();
      }
    }
    System.out.println("Enter the array 2 values");
    for(int i=0;i<row;i++){
      for(int j=0;j<colm;j++){
        b[i][j]=s.nextInt();
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<colm;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println(" ");
    }
  
    for(int i=0;i<row;i++){
      for(int j=0;j<colm;j++){
        System.out.print(b[i][j]+" ");
      }
      System.out.println("   ");
    }
    System.out.println("+ +");
    System.out.println("-------------");
    for(int i=0;i<row;i++){
      for(int j=0;j<colm;j++){
        c[i][j]=a[i][j]+b[i][j];
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<colm;j++){
        System.out.print(c[i][j]+" ");
      }
      System.out.println(" ");
    }
  }
}