import java.util.*;
class Puzzle{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);    
    int a[][]= new int[5][5];
    int count=0;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        a[i][j]=s.nextInt();
      }
    }
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        if(a[i][j]>10&&a[i][j]!=20){
         count=1;
          break;
        }
      }
    }
    if(count==1){
      System.out.println("no");
    }
    else{
      System.out.println("yes");
    }
  }
}